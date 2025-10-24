package Student;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student("Liam", "10th Grade");
        s.addCourse("Math");
        s.addCourse("Science");
        s.displayInfo();
        s.removeCourse("Math");
        s.displayInfo();
    }
}
