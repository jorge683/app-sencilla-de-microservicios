package com.example.golden;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PersonController {
    
    private static final String MAXIMO_TIEMPO_DE_ESPERA = "1000";
    private Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Value("${timeoutInMilliseconds:10}")
    private Long timeout;

    @Value("${delayMessage:Vuelva-a-intentar}")
    private String delayMessage;

    @GetMapping("/person/ci/{ci}")
    @HystrixCommand(fallbackMethod = "fallbackResponse", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = MAXIMO_TIEMPO_DE_ESPERA) })
    public PersonDTO getPersonByCI(@PathVariable String ci) throws InterruptedException {

        logger.info("timeout is {}", timeout);
        Thread.sleep(timeout);
        
        PersonDTO person = new PersonDTO("Jorge", "Rodriguez", ci);
        logger.info("Datos solicitados: {}", person);
        return person;
    }

    public PersonDTO fallbackResponse(String ci) {
        logger.info(delayMessage, ci);
        return null;
    }
}