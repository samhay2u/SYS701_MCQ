# Security+ Quiz Application

## Overview
This application provides a comprehensive quiz platform for Security+ certification preparation. It features question management, quiz sessions, performance tracking, and administrative capabilities.

## Architecture
The application follows a microservices architecture with the following components:
- API Gateway Service
- Discovery Service
- Auth Service
- Quiz Service
- Session Service
- Admin Service

## Technology Stack
- Java 17
- Spring Boot 3.2
- Spring Cloud
- Spring Security with JWT
- Spring Data JPA
- PostgreSQL
- Redis for Caching
- RabbitMQ for Messaging
- Docker & Kubernetes
- Prometheus & Grafana for Monitoring

## Development Roadmap
This project is being developed in phases:
1. Foundation Setup
2. Monolith Enhancement
3. Microservices Preparation
4. Service Implementation (Auth, Quiz, Session, Admin)
5. Advanced Features & Integration
6. Performance Optimization
7. Security Hardening & Documentation

## Getting Started
See [CONTRIBUTING.md](./CONTRIBUTING.md) for setup instructions.




markdown## Installation Instructions for Instructors

### Prerequisites
- Java 17 or higher
- Maven 3.8+ (or use the Maven wrapper included in the project)
- Git
- IntelliJ IDEA (recommended) or another Java IDE

### Clone and Setup
1. Clone the repository
git clone https://github.com/samhay2u/SYS701_MCQ.git
cd SYS701_MCQ

2. Build the project
mvn clean install
Or using the Maven wrapper:
./mvnw clean install

3. Import into IntelliJ IDEA
- Open IntelliJ IDEA
- Select "Open or Import"
- Navigate to the cloned project directory
- Select the `pom.xml` file and open as a project

### Run the Application
1. From IntelliJ IDEA:
- Locate `Sys701McqApplication.java` in the Project Explorer
- Right-click and select "Run 'Sys701McqApplication'"

2. From command line:
mvn spring-boot

3. Access the application:
- Open a web browser and navigate to `http://localhost:8080`
- H2 Console is available at `http://localhost:8080/h2-console` (credentials in application.properties)

### Project Structure Overview
- `src/main/java/com/example/mcq/model` - Domain models
- `src/main/java/com/example/mcq/repository` - Data access layer
- `src/main/java/com/example/mcq/service` - Business logic
- `src/main/java/com/example/mcq/controller` - REST API endpoints
- `src/main/java/com/example/mcq/config` - Application configuration

### Initial Credentials
- H2 Database:
- JDBC URL: `jdbc:h2:mem:mcqdb`
- Username: `sa`
- Password: `password`
