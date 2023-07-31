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
