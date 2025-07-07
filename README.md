# Equipment Management System

This project is a comprehensive equipment management system designed to streamline construction operations. It consists of two main parts: a Spring Boot backend for managing data and a Next.js frontend for providing a user interface. The system allows for tracking equipment, managing maintenance, handling financial transactions, and generating reports.

## 📑 Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Backend Setup](#backend-setup)
- [Frontend Setup](#frontend-setup)
- [Database Schema](#database-schema)
- [Sequence Diagram](#sequence-diagram)

---

## 🚀 Project Overview

The **Equipment Management System** is tailored for construction firms to monitor and manage heavy machinery and associated resources efficiently. It provides:

- Real-time equipment tracking  
- Detailed maintenance logs  
- Role-based access for employees  
- Visual dashboards and reports  
- Financial tools such as petty cash and stock tracking  

### 🔍 Screenshots
![Landing_page](https://github.com/user-attachments/assets/65fafb25-be5e-49bd-b974-a10d3a676464)
![Home_page](https://github.com/user-attachments/assets/9b1e0d76-a4ed-407d-ad3b-f2f21b718b3d)
![Projects](https://github.com/user-attachments/assets/f1197372-29f9-4a45-a35d-bf1355265914)
![Footer](https://github.com/user-attachments/assets/b9f65f9b-ac89-4c5d-b017-d80b950259b7)


## Technologies Used

*   **Backend:** Spring Boot, Java 17
*   **Frontend:** Next.js 14, React, Tailwind CSS, Radix UI, Supabase

## Backend Setup

### Prerequisites

*   Java Development Kit (JDK) version 17
*   Maven
*   MySQL Database

### Configuration

1.  **Database Configuration:** Update the `application.properties` file located in `backend/src/main/resources/` with your MySQL database credentials. Example:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/machinery-mgmt?createDatabaseIfNotExist=true&useSSL=false&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true
    spring.datasource.username=root
    spring.datasource.password=password
    ```

2.  **Build the Application:** Navigate to the `backend/` directory and use the Maven wrapper to build the project.

    ```bash
    ./mvnw clean install
    ```

3.  **Run the Application:** After building, run the Spring Boot application.

    ```bash
    java -jar target/machinary-mgmt-0.0.1-SNAPSHOT.jar
    ```

### Key Backend Components

*   **DataInitializer.java:** Initializes the database with sample data.
    *   [backend/src/main/java/com/machinarymgmt/service/api/components/DataInitializer.java](https://github.com/AnantNagarajHegde/MI-6.0/blob/main/backend/src/main/java/com/machinarymgmt/service/api/components/DataInitializer.java)

*   **ApiResponseBuilder.java:** Builds standardized API responses.
    *   [backend/src/main/java/com/machinarymgmt/service/api/builder/ApiResponseBuilder.java](https://github.com/AnantNagarajHegde/MI-6.0/blob/main/backend/src/main/java/com/machinarymgmt/service/api/builder/ApiResponseBuilder.java)

*   **Repositories:** JPA repositories for database interactions. Examples include `DepartmentRepository.java`, `EmployeeRepository.java`, and `EquipmentRepository.java`.
    *   [backend/src/main/java/com/machinarymgmt/service/api/data/DepartmentRepository.java](https://github.com/AnantNagarajHegde/MI-6.0/blob/main/backend/src/main/java/com/machinarymgmt/service/api/data/DepartmentRepository.java)

*   **Controllers:** REST controllers for handling API endpoints, such as `DepartmentController.java` and `EquipmentController.java`.
    *   [backend/src/main/java/com/machinarymgmt/service/api/v1/DepartmentController.java](https://github.com/AnantNagarajHegde/MI-6.0/blob/main/backend/src/main/java/com/machinarymgmt/service/api/v1/DepartmentController.java)

*   **OpenApiConfig.java:** Configuration for OpenAPI (Swagger) documentation.
    *   [backend/src/main/java/com/machinarymgmt/service/api/config/OpenApiConfig.java](https://github.com/AnantNagarajHegde/MI-6.0/blob/main/backend/src/main/java/com/machinarymgmt/service/api/config/OpenApiConfig.java)

### API Endpoints

The backend provides a variety of REST API endpoints, including:

*   `/api/v1/equipment`: Manages equipment inventory.
*   `/api/v1/projects`: Manages construction projects.
*   `/api/v1/maintenance`: Manages maintenance and servicing records.
*   `/api/v1/categories`: Manages equipment categories.

## Frontend Setup

### Prerequisites

*   Node.js (version 18 or higher)
*   npm (version 9 or higher)

### Configuration

1.  **Install Dependencies:** Navigate to the `fro4.0/` directory and install the required dependencies.

    ```bash
    npm install
    ```

2.  **Environment Variables:** Create a `.env.local` file in the root directory of the `fro4.0/` folder to configure the Supabase URL and anonymous key.

    ```
    NEXT_PUBLIC_SUPABASE_URL=your_supabase_url
    NEXT_PUBLIC_SUPABASE_ANON_KEY=your_supabase_anon_key
    ```

3.  **Run the Application:** Start the Next.js development server.

    ```bash
    npm run dev
    ```

    Open your browser and go to `http://localhost:3000` to view the application.

### Key Frontend Components

*   **app directory:** Contains Next.js route handlers and page components.
    *   `/src/app/`

*   **components directory:** Contains reusable UI components.
    *   `/src/components/`

*   **services directory:** Contains API service functions for interacting with the backend.
    *   `/src/services/`

*   **lib directory:** Contains utility functions and configurations such as `supabase.ts` and `api.ts`.
    *   `/src/lib/`

### Important files

*   `config.ts`: Contains the API URL.
    *   [/fro4.0/src/config.ts](https://github.com/AnantNagarajHegde/MI-6.0/blob/main/fro4.0/src/config.ts)
*   `supabase.ts`: Initializes the Supabase client.
    *   [/fro4.0/src/lib/supabase.ts](https://github.com/AnantNagarajHegde/MI-6.0/blob/main/fro4.0/src/lib/supabase.ts)

## Database Schema

The backend uses a MySQL database with several tables to manage different aspects of the system. The key tables include:

*   `Dept`: Departments
*   `Designation`: Designations
*   `Employee`: Employees
*   `Project`: Projects
*   `Equipment_Category`: Equipment Categories
*   `Equipment`: Equipment
*   `Equipment_Utilization`: Equipment Utilization data
*   `Incident_Report`: Incident Reports
*   `Items`: Items for materials and spares
*   `Machinery_Maintenance_Log`: Maintenance Logs
*   `Maintenance_Parts_Used`: Maintenance Parts Used
*   `Maintenance_Readings`: Maintenance Readings
*   `Make`: Equipment Makes
*   `Mast_Anchorage_Details`: Mast Anchorage Details
*   `Model`: Equipment Models
*   `Overtime_Report`: Overtime Reports
*   `Petty_Cash_Transaction`: Petty Cash Transactions
*   `Stock_Statement`: Stock Statements
*   `users`: User data

## Sequence Diagram

Here is a high-level sequence diagram illustrating the interaction between the frontend, backend, and database for a typical data fetch operation:

```mermaid
sequenceDiagram
    participant F as Frontend (Next.js)
    participant B as Backend (Spring Boot)
    participant DB as Database (MySQL)

    F->>B: API Request (e.g., GET /api/v1/equipment)
    activate B
    B->>DB: Query Database
    activate DB
    DB->>B: Data Response
    deactivate DB
    B->>F: API Response (JSON)
    deactivate B
    F->>Browser: Display Data
