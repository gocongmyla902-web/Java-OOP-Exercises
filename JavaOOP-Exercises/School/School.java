package School;

import java.util.ArrayList;
import java.util.List;

    public class School {
    private List<String> students = new ArrayList<>();
    private List<String> teachers = new ArrayList<>();

    public List<String> getStudents() { return students; }
    public List<String> getTeachers() { return teachers; }

    public void addStudent(String student) { students.add(student); }
    public void addTeacher(String teacher) { teachers.add(teacher); }
    public void removeStudent(String student) { students.remove(student); }
    public void removeTeacher(String teacher) { teachers.remove(teacher); }

    public void showDetails() {
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
    }
}

