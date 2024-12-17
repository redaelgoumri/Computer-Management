# **Computer Management - Test Project**

A lightweight **Spring Boot + GraphQL** project for testing and demonstration purposes. The project focuses on managing `Computer` entities with basic CRUD operations through GraphQL APIs.

---

## **Features**
- ✅ **GraphQL** Queries and Mutations for interacting with the `Computer` entity.  
- ✅ **Modular and Clean Architecture** using DTOs and Model Mapping.  
- ✅ **H2 In-Memory Database** for quick testing and prototyping.  
- ✅ Built with **Spring Boot 3.3.5** and **GraphQL Support**.  

---

## **Project Structure**

```
src
│
├── main
│   ├── java
│   │   └── ma
│   │       └── elgoumri
│   │           └── computermanagement
│   │               ├── dao
│   │               │   ├── entities
│   │               │   │   └── Computer.java          # Entity Class
│   │               │   └── repositories
│   │               │       └── ComputerRepository.java
│   │               │
│   │               ├── service
│   │               │   ├── ComputerService.java       # Service Interface
│   │               │   ├── ComputerManager.java       # Service Implementation
│   │               │   └── mapping
│   │               │       └── ComputerMapping.java   # DTO ↔ Entity Mapping
│   │               │
│   │               ├── web
│   │               │   └── ComputerGraphQLController.java  # GraphQL Controller
│   │               │
│   │               └── exceptions
│   │                   └── GraphQLExceptionHandler.java   # Exception Handling
│   │
│   └── resources
│       ├── application.properties                       # Configuration for H2 and GraphQL
│       └── graphql
│           └── Computer.graphqls                        # GraphQL Schema
│
└── test
    └── java
        └── ma
            └── elgoumri
                └── computermanagement                   # Test Cases
```

---

## **Technology Stack**
- **Backend**: Spring Boot 3.3.5
- **GraphQL**: Spring Boot GraphQL
- **Database**: H2 In-Memory Database
- **Mapping**: ModelMapper

---

## **GraphQL Endpoints**

### **Mutation: Save Computer**
```graphql
mutation {
  saveComputer(
    computerDto: {
      proce: "Intel i5",
      ram: "8GB",
      hardDrive: "512GB SSD",
      price: 700.0,
      macAddress: "00:1B:44:11:3A:B7"
    }
  ) {
    proce
    ram
    hardDrive
    price
  }
}
```

### **Query: Get Computers by Processor**
```graphql
query {
  getComputerByProce(proce: "Intel i5") {
    proce
    ram
    hardDrive
    price
  }
}
```

---

## **How to Run**

1. Clone the repository:
   ```bash
   git clone https://github.com/username/ComputerManagement-TestProject.git
   ```

2. Navigate to the project directory:
   ```bash
   cd ComputerManagement-TestProject
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Access GraphiQL UI at:
   ```
   http://localhost:8088/graphiql
   ```

---

## **Project Purpose**
This project is designed for testing and demonstration purposes. It showcases the integration of Spring Boot, GraphQL, and H2 in-memory database for efficient CRUD operations on a `Computer` entity.
