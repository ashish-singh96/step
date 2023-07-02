# Job Management System
The Job Management System is a Spring Boot application that allows users to perform CRUD operations on job entities and includes validation using Spring Boot annotations.

## Technologies Used
Java<br>
Spring Boot<br>
Spring Data JPA<br>
H2 Database<br>
Getting Started<br>
Prerequisites<br>
Java 8 or higher<br>
Maven<br>

# Usage
### API Endpoints
The following API endpoints are available:

GET /jobs: Get all jobs<br>
GET /jobs/{id}: Get job by ID<br>
POST /jobs: Create a new job<br>
PUT /jobs/{id}: Update an existing job<br>
DELETE /jobs/{id}: Delete a job by ID<br>

# Error Handling
If there are any validation errors, the API will return a 400 Bad Request response with error details.
If a requested resource is not found, the API will return a 404 Not Found response.


# Project Description:

The Job Management System is a web application developed using Spring Boot that provides functionality to manage job entities. It allows users to perform CRUD (Create, Read, Update, Delete) operations on jobs and includes validation using Spring Boot annotations.

The application uses an H2 database, which is an in-memory database, to store job data. The job entity consists of various fields such as title, description, location, salary, company email, company name, employer name, job type, and applied date.

The project includes the following features and components:

1. CRUD Operations: Users can create new jobs, retrieve existing jobs by ID or get all jobs, update job details, and delete jobs using the provided API endpoints.

2. Validation: The application performs validation on the job entity using Spring Boot annotations. For example, the salary field is validated using the @Min annotation to ensure it is above 20,000.

3. Custom Finders: Custom finder methods are implemented in the JobRepository interface. Users can retrieve jobs based on specific criteria, such as location or company name, by calling these methods.

4. Custom Queries: Custom queries are used to perform write operations like updating job titles and deleting jobs. These queries are defined using the @Query annotation and fired based on method names in the JobRepository interface.

5. API Endpoints: The application exposes RESTful API endpoints that allow users to interact with the job management system. These endpoints support various HTTP methods such as GET, POST, PUT, and DELETE.

