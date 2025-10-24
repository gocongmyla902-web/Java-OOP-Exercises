package School;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent("Anna");
        school.addTeacher("Mr. Smith");
        school.showDetails();
    }
}
