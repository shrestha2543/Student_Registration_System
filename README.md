# Student Registration System

## Overview of the Project:
It is a modular Java application for managing student enrollments and course records.

## Features:
1. **Student Management:** Register unique IDs and details of each student.
2. **Course Catalog:** Students can check and organize the courses with fixed limits.
3. **Enrollments:** Students can register for courses with fixed limits and ensure that there are no duplicate checks
4. **Reports:** View current student profiles and their registered courses.

## Technologies/Tools Used
1. **Programming Language:** Java (JDK 8 or higher)
2. **Environment:** VS Code / Command Line Interface
3. **Version Control:** Git & Github

## Steps to run the project:
1. Compile all the files using javac *.java
2. Run it using java Main

## Instructions for Testing
1. **Compilation and execution:** Open the project terminal in the root directory and compile all the files using 'javac *.java' and run them using 'java Main'
    * Expected Outcome: The program should compile easily with no syntax errors and display the main prompt requesting the student's ID and name.
2. **Register Students:** Enter Student ID and Name. Select option 1 to view available courses and 2 to enroll in CS101.
    * Expected Outcome: The system displays 'Successfully registered for Java Programming!' once without duplicate confirmation lines.
3. **Duplicate Course Validation:** Select option 2 again and enter course code CS101 again.
    * Expected Outcome: The application will reject the request and display error 'You are already registered for Java Programming!' and return to the main menu.
4. **Maximum Capacity:** Register for two additional courses (CS102 and MATH201)and then attempt to enroll in a 4th course.
    * Expected Outcome: The system enforces the capacity restriction and displays an error message stating that the maximum course limit (3 courses) has been reached.
5. **View Reports:** Display student profiles and active course lists to confirm enrollment data matches accurately
