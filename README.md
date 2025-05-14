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

employee_department_management/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/employeemanagement/
│   │   │       ├── controller/         # REST Controllers for handling HTTP requests
│   │   │       │   └── EmployeeController.java
│   │   │       │   └── DepartmentController.java
│   │   │       ├── model/              # Entity classes (JPA)
│   │   │       │   └── Employee.java
│   │   │       │   └── Department.java
│   │   │       ├── repository/         # JPA Repositories
│   │   │       │   └── EmployeeRepository.java
│   │   │       │   └── DepartmentRepository.java
│   │   │       ├── service/            # Business logic layer
│   │   │       │   └── EmployeeService.java
│   │   │       │   └── DepartmentService.java
│   │   │       └── EmployeeDepartmentManagementApplication.java  # Main Spring Boot class
│   │   └── resources/
│   │       ├── application.properties  # DB config, JPA settings.
│   │       └── static/                 # static resources CSS/JS
│   │       └── templates/              # Thymeleaf
├── pom.xml                             # Maven configuration
└── README.md
