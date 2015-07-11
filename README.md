# Zuul Service (smart routing) for a project toying around with the Microservice-style Architecture

Zuul uses Ribbon to lookup available services and routes the external request to an appropriate service instance.

## Uses

* [Spring Cloud 1.0.2.RELEASE](http://projects.spring.io/spring-cloud/)
* [Remote Config Repo](https://github.com/kirstywilliams/ms-config)
* [Config Server](https://github.com/kirstywilliams/ms-config-server)
* [Eureka Server](https://github.com/kirstywilliams/ms-eureka-service)

## Running

Run this app as a normal Spring Boot app. It runs on port 8765 (defined in application.yml).
Also, run the following:

* [Eureka Server](https://github.com/kirstywilliams/ms-eureka-service)
* [Config Server](https://github.com/kirstywilliams/ms-config-server)

Configure API endpoints in application.yml as proxy routes.