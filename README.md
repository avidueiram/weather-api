# Weather-API

La API cuenta un endpoint para obtener el pronóstico semanal para una ciudad de Chile.

## Arquitectura
En la implementación actual, el microservicio actua como un simple endpoint disponibilizado mediante un puerto en particular, el que podría ser consumido por una aplicación. Para hacer el balanceo de carga, este tendría que realizarse mediante por ejemplo un Elastic Load Balancing. Ahora bien, si en cambio, este servicio fuera a ser consumido por ejemplo por otro servicio, se podría configurar mediante el uso de Ribbon un balanceo por el lado del client, corriendo multiples instancias del servicio y Eureka para administrar dichas instancias (descubrimiento y status).

Otro punto a considerar es el uso de una base de datos H2 en memoria con el fin de guardar las ciudades disponibles para consulta, la cual en el caso más real, debiera ser una de tipo persistente.

## Requisitos
- Java 1.8
- Maven 3.6.3

## Compilación
```shell script
$ mvm clean install
```

## Ejecutar
Dejar archivo application.properties en el mismo directorio que la compilación resultante (target):
```shell script
java -jar ./target/weather-api-0.0.1-SNAPSHOT.jar --server.port=8080
...
```

## Swagger
Para revisar el endpoint, ejecutar el proyecto e ir a http://localhost:8080/swagger-ui.html

Ciudades disponible para consultar

## Tests
```shell script
$ mvn clean test
```

Cobertura: target/site/jacoco/index.html

