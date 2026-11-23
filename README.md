# 🛒 E-Commerce Backend

A REST API project built using Java, Spring Boot, and MySQL to manage e-commerce products and categories.

## 🚀 Features

### Product Management
- Create, Read, Update & Delete Products (CRUD)
- Pagination and Sorting
- Input Validation
- Product-Category Relationship

### Category Management
- Create Categories
- Get All Categories
- Get Category by ID
- Delete Categories

### Exception Handling
- Global Exception Handling
- Custom Product Not Found Exception
- Structured Error Responses

## 🛠️ Tech Stack

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## ⚙️ Setup

1. Clone this repository.
2. Configure MySQL in `application.properties`.
3. Open the project in IntelliJ IDEA.
4. Run `EcommerceBackendApplication.java`.

## 📌 API Examples

**Products**
- `POST /api/products`
- `GET /api/products`
- `GET /api/products/{id}`
- `PUT /api/products/{id}`
- `DELETE /api/products/{id}`

**Categories**
- `POST /api/categories`
- `GET /api/categories`
- `GET /api/categories/{id}`
- `DELETE /api/categories/{id}`

**Pagination & Sorting Example**

`GET /api/products?page=0&size=5&sort=price,asc`

## 📈 Project Status

Backend development in progress. More e-commerce features will be added in future updates.

## 👨‍💻 Author

**Subhanshu Singh** · [GitHub](https://github.com/subhanshu-DEV)
