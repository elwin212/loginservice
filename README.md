# LoginService

LoginService is a Spring Boot application that provides REST APIs for basic user login and registration using Spring Security 6.0. The application utilizes PostgreSQL as its database. Users can register by sending a POST request through the API, and upon successful registration, the application sends a confirmation email to the user. Once the user activates their account through the email link, they can log in to the system.

## Technologies Used

- Spring Boot 3
- Spring Security 6.0
- PostgreSQL

## Features

- User registration with email confirmation
- User login with activated accounts

## Setup and Installation

1. Clone the repository to your local machine.
2. Set up the PostgreSQL database and configure the necessary credentials in the application.properties file.
3. Build the application using your favorite Java IDE or by running the provided Maven command.
4. Launch the application by running the main class `LoginApplication.java`.

## Security

The application uses Spring Security to protect the endpoints and handle user authentication and authorization. Passwords are securely hashed and stored in the database to ensure user data privacy.

### Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.1/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.1/maven-plugin/reference/html/#build-image)
- [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web)
- [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#data.sql.jpa-and-spring-data)
- [Spring Security](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#web.security)
- [Java Mail Sender](https://docs.spring.io/spring-boot/docs/3.1.1/reference/htmlsingle/#io.email)
