package com.example.kangaroo;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PersonController {

    private Logger logger = LoggerFactory.getLogger(PersonController.class);

    @PostMapping(value = "/person", name = "Create a person")
    public PersonDTO createPerson(@RequestBody @Valid PersonDTO dto) {
        logger.info("Se ha registrado la persona {}", dto);
        return dto;
    }
}