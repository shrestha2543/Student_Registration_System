import java.util.ArrayList;

public class RegistrationSystem
 {
    private Student student;
    private ArrayList<Course> registeredCourses = new ArrayList<>();

    public RegistrationSystem(Student student)
    {
        this.student = student;
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
    }

    public void printRegistrationSummary()
    {
        System.out.println("\n--- ENROLLMENT STATUS ---");
        System.out.println("Student Details: " + student);
        System.out.println("Enrolled Courses:");
        int totalCredits = 0;
        for (Course course : registeredCourses) 
        {
            System.out.println("- " + course.getTitle() + " (" + course.getCourseCode() + ")");
            totalCredits += course.getCredits();
        }
        System.out.println("Total Registered Credits are: " + totalCredits);
        System.out.println("--------------------------");
    }
}