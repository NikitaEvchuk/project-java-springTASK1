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

<img width="1599" height="730" alt="image" src="https://github.com/user-attachments/assets/babfd5b3-85fd-451a-b5ec-314299d0defc" />


### 2. Create a Product (POST)
**Endpoint:** `/api/v1/products`
We can add a new product to the database
* **Input:** JSON body with the product name
* **Response:** Status `201 Created` and the created product with its ID

<img width="1401" height="636" alt="image" src="https://github.com/user-attachments/assets/f8bb3caa-1a36-4389-8025-d1506571a375" />


### 3. Get All Products (GET)
**Endpoint:** `/api/v1/products`
Retrieves a list of all products currently stored in the database

<img width="1457" height="711" alt="image" src="https://github.com/user-attachments/assets/2f46f969-8bc9-431c-a6fa-d911b37abd92" />


### 4. Get Product by ID (GET)
**Endpoint:** `/api/v1/products/{id}`
Retrieves a single product details by its unique ID

<img width="1575" height="701" alt="image" src="https://github.com/user-attachments/assets/deebed96-5a6d-4b5c-afae-3f99d2242d9d" />
<img width="1599" height="708" alt="image" src="https://github.com/user-attachments/assets/9c13a2a8-b7a3-4780-8214-ea508c8abc8c" />



### 5. Update Product (PUT)
**Endpoint:** `/api/v1/products/{id}`
Updates the details (name) of an existing product
* **Input:** ID in URL and JSON body with the new name
* **Response:** Status `200 OK` and the updated product

<img width="1599" height="707" alt="image" src="https://github.com/user-attachments/assets/4fe63a6a-dc5a-4c97-93d1-d8971f93883a" />


### 6. Delete Product (DELETE)
**Endpoint:** `/api/v1/products/{id}`
Removes a product from the database
* **Response:** Status `204 No Content`
<img width="1599" height="699" alt="image" src="https://github.com/user-attachments/assets/cfd27174-64ad-4ac1-a71c-01a88508c23c" />
<img width="1599" height="660" alt="image" src="https://github.com/user-attachments/assets/6373efae-49af-471e-a897-51cb2b82d831" />



### 7. Exception Handling (404 Not Found)
If we try to find a product that does not exist in the database, the API returns an error message and status `404`.
<img width="1486" height="652" alt="image" src="https://github.com/user-attachments/assets/b99a5596-9da7-48cf-8edb-dc808a2e61d1" />



---

## Database Check (H2 Console)
We can verify that the data is actually saved in the database
* **URL:** `http://localhost:8080/console`
* **JDBC URL:** `jdbc:h2:mem:testdb`
<img width="1599" height="727" alt="image" src="https://github.com/user-attachments/assets/81eb75eb-e698-49a6-ae88-dc7ce67045ce" />

