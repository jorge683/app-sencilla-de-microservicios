# Proyecto-final-curso-microservicios
En este proyecto se usaron las siguientes herramientas: 
- Service Discovery (Eureka)
- Circuit Breaker (Hystrix)
- Intelligent Routing (Zuul)
- Spring Cloud Config Server

### Ejecución del proyecto
- Primero se deben empaquetar los servicios. Se puede realizar fácilmente ejecutando: `./build-jars.sh`
- Luego ya se puede ejecutar usando Docker(`docker-compose up`)