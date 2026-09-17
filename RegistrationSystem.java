import java.util.ArrayList;

public class RegistrationSystem
 {
    private Student student;
    private ArrayList<Course> registeredCourses = new ArrayList<>();

    public RegistrationSystem(Student student)
    {
        this.student = student;
    }

    public void registerCourse(Course course) 
    {
    for (Course c : registeredCourses) 
    {
        if (c.getCourseCode().equalsIgnoreCase(course.getCourseCode())) 
        {
            System.out.println("Error: You are already registered for " + course.getTitle() + " (" + course.getCourseCode() + ")!");
            return;
        }
    }
    if (registeredCourses.size() >= 3) 
    {
        System.out.println("Error: Maximum limit of 3 courses reached! Cannot register for " + course.getCourseCode() + ".");
        return;
    }
    registeredCourses.add(course);
    System.out.println("Successfully registered for " + course.getTitle() + "!");
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