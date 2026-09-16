import java.util.Scanner;

public class Main 
{
    public static void main(String args[]101) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---STUDENT REGISTRATION SYSTEM---");
        System.out.print("Enter Student's ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // this will clear buffer
        
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        Student student = new Student(id, name);
        CourseManager courseManager = new CourseManager();
        RegistrationSystem registrationSystem = new RegistrationSystem(student);

        while (true) {
            System.out.println("\n1. View Available Courses\n2. Register for Course\n3. View Summary & Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                courseManager.displayCourses();
            } else if (choice == 2) {
                System.out.print("Enter Course Code (e.g., CS101): ");
                String code = scanner.next();
                Course course = courseManager.getCourseByCode(code);
                if (course != null) {
                    registrationSystem.registerCourse(course);
                    System.out.println("Successfully registered for " + course.getTitle() + "!");
                } else {
                    System.out.println("Course code not found!");
                }
            } else if (choice == 3) {
                registrationSystem.printRegistrationSummary();
                break;
            }
        }
        scanner.close();
    }
}