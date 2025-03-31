# Java MySQL Backend Project

This project is a Spring Boot application that connects to a MySQL database. It provides a RESTful API for performing CRUD operations on a data model.

## Project Structure

```
java-mysql-backend
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── Application.java
│   │   │           ├── config
│   │   │           │   └── DatabaseConfig.java
│   │   │           ├── controller
│   │   │           │   └── ApiController.java
│   │   │           ├── model
│   │   │           │   └── Entity.java
│   │   │           ├── repository
│   │   │           │   └── EntityRepository.java
│   │   │           └── service
│   │   │               └── EntityService.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── schema.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── ApplicationTests.java
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven
- MySQL Database

### Installation

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd java-mysql-backend
   ```

3. Update the `application.properties` file with your MySQL database connection details.

4. Run the application:
   ```
   mvn spring-boot:run
   ```

### API Endpoints

- **GET /api/entities**: Retrieve all entities.
- **GET /api/entities/{id}**: Retrieve a specific entity by ID.
- **POST /api/entities**: Create a new entity.
- **PUT /api/entities/{id}**: Update an existing entity.
- **DELETE /api/entities/{id}**: Delete an entity.

### Database Schema

The database schema can be initialized using the `schema.sql` file located in the `src/main/resources` directory.

### Running Tests

To run the tests, use the following command:
```
mvn test
```

## License

This project is licensed under the MIT License.