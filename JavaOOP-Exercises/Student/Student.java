package Student;

import java.util.ArrayList;
import java.util.List;

    public class Student {
    private String name;
    private String grade;
    private List<String> courses = new ArrayList<>();

    public Student(String name, String grade) { this.name = name; this.grade = grade; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    public List<String> getCourses() { return courses; }
    public void addCourse(String course) { courses.add(course); }
    public void removeCourse(String course) { courses.remove(course); }

    public void displayInfo() { System.out.println("Name: " + name + ", Grade: " + grade + ", Courses: " + courses); }
}

