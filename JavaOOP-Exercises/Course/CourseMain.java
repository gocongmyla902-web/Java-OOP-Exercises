package Course;

public class CourseMain {
    public static void main(String[] args) {
        OnlineCourse oc = new OnlineCourse("Java OOP", "Mr. Tan", 3, "Udemy", 6);
        oc.displayDetails();
        System.out.println("Eligible for certificate: " + oc.eligibleForCertificate());
    }
}
