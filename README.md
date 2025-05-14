# Employee Management System (Full Stack)

A simple full-stack web application for managing employees, developed using **Spring Boot** for the backend and **HTML/CSS** for the frontend. The project follows the **MVC (Model-View-Controller)** architecture and uses an in-memory **H2 database** for quick development and testing.

---

## 🛠️ Technologies Used

### 🔙 Backend
- **Java 17+**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **H2 Database**
- **Lombok**
- **JPA Relationships (Tables & Mappings)**

### 🌐 Frontend
- **HTML**
- **CSS**

---

## 📌 Features

- Add, update, delete, and view employee records.
- Simple and clean user interface built with plain HTML and CSS.
- Fully functional backend with RESTful endpoints and form submissions.
- Uses H2 database for ease of development (no setup needed).
- Follows clean MVC separation between data, business logic, and UI.
- Validations and feedback on forms for better user experience.

---

## 🗂️ Project Structure

src/main/java/com/example/employeemanagement/

controller/ — Handles routing and form submissions

model/ — Contains entity class Employee.java

repository/ — Contains EmployeeRepository.java for CRUD operations

service/ — Contains EmployeeService.java for business logic

EmployeeManagementApplication.java — Main class to run the Spring Boot application

src/main/resources/

application.properties — Configuration file (using H2 in-memory database)

static/css/ — Contains custom styles

templates/ — Contains HTML views like:

index.html

employee-list.html

employee-form.html

pom.xml — Maven configuration for dependencies and plugins
