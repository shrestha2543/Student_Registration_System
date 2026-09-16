# Student Registration System

It is a modular Java application for managing student enrollments and course records.


## Features:
* **Student Management:** Register unique IDs and details of each student.
* **Course Catalog:** Students can check the courses.
* **Enrollments:** Register students for courses with validation.
* **Reports:** View current student profiles and their registered courses.


## Non-Functional Requirements
* **Usability:** Simple command-line interface
* **Reliability:** Prevents duplicate entries and oversubscription
* **Maintainability:** OOP-based modular structure
* **Error Handling:** Input validation to prevent crashes


## Architecture
* `Student.java` – Student attributes and course list
* `Course.java` – Course details and capacity tracking
* `CourseManager.java` – Course catalog management
* `RegistrationSystem.java` – Business logic and mapping
* `Main.java` – CLI entry point and menu


## Requirements
* Java Development Kit (JDK 8 or higher)


## How to Run

1. **Compile all files:** using javac *.java
2. **Run all files:** using java main
   ```bash
   javac *.java
