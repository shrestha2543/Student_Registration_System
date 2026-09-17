# Student Registration System

## Overview of the Project:
It is a modular Java application for managing student enrollments and course records.

## Features:
* **Student Management:** Register unique IDs and details of each student.
* **Course Catalog:** Students can check and organize the courses with fixed limits.
* **Enrollments:** Students can register for courses with fixed limits and ensure that there are no duplicate checks
* **Reports:** View current student profiles and their registered courses.

## Technologies/Tools Used
1. **Programming Language:** Java (JDK 8 or higher)
2. **Environment:** VS Code / Command Line Interface
3. **Version Control:** Git & Github

## Steps to run the project:
1. Compile all the files using javac *.java
2. Run it using java Main

## Instructions for Testing
1. **Add a Course:** Select the option to add a course (e.g., Code: 'CS101', Title: Data Structures, Capacity: 2).
2. **Register Students:** Register two new students (e.g., ID: S101, Name: Aisha and ID: S102, Name: Ravi).
3. **Enroll Students:** Enroll both S101 and S102 into course CS101.
4. **Capacity Validation Test:** Attempt to enroll a third student ('S103') into 'CS101' to verify that the system blocks oversubscription when the capacity limit is reached.
5. **View Reports:** Display student profiles and active course lists to confirm enrollment data matches accurately
