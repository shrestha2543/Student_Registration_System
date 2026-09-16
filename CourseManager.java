import java.util.ArrayList;

public class CourseManager {
    private ArrayList<Course> availableCourses = new ArrayList<>();

    public CourseManager() {
        // Pre-populating default courses
        availableCourses.add(new Course("CS101", "Java Programming", 4));
        availableCourses.add(new Course("CS102", "Data Structures", 3));
        availableCourses.add(new Course("MATH201", "Discrete Mathematics", 3));
    }

    public void displayCourses() {
        System.out.println("\n--- AVAILABLE COURSES ---");
        for (Course course : availableCourses) {
            System.out.println(course);
        }
    }

    public Course getCourseByCode(String code) {
        for (Course course : availableCourses) {
            if (course.getCourseCode().equalsIgnoreCase(code)) {
                return course;
            }
        }
        return null;
    }
}