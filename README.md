# Spring Boot REST API Project

## Description
This project is a REST API application built using Java and Spring Boot. It allows users to manage products (CRUD operations: Create, Read, Update, Delete). The application uses an **H2 in-memory database** to store data and **Swagger UI** for easy API testing and documentation.

## Technologies used in this project
- Java 17
- Spring Boot 3.3.5
- Spring Data JPA
- H2 Database
- Swagger UI (OpenAPI)
- Maven



## API Documentation
You can access the full API documentation and test endpoints using Swagger UI:
* **URL:** `http://localhost:8080/swagger-ui/index.html`

---

## How the project works 

Below are the screenshots demonstrating the functionality of the application.

### 1. Main Dashboard (Swagger UI)
The Swagger interface lists all available endpoints for the Product Controller.



### 2. Create a Product (POST)
**Endpoint:** `/api/v1/products`
We can add a new product to the database
* **Input:** JSON body with the product name
* **Response:** Status `201 Created` and the created product with its ID



### 3. Get All Products (GET)
**Endpoint:** `/api/v1/products`
Retrieves a list of all products currently stored in the database



### 4. Get Product by ID (GET)
**Endpoint:** `/api/v1/products/{id}`
Retrieves a single product details by its unique ID



### 5. Update Product (PUT)
**Endpoint:** `/api/v1/products/{id}`
Updates the details (name) of an existing product
* **Input:** ID in URL and JSON body with the new name
* **Response:** Status `200 OK` and the updated product



### 6. Delete Product (DELETE)
**Endpoint:** `/api/v1/products/{id}`
Removes a product from the database
* **Response:** Status `204 No Content`


### 7. Exception Handling (404 Not Found)
If we try to find a product that does not exist in the database, the API returns an error message and status `404`.



---

## Database Check (H2 Console)
We can verify that the data is actually saved in the database
* **URL:** `http://localhost:8080/console`
* **JDBC URL:** `jdbc:h2:mem:testdb`

