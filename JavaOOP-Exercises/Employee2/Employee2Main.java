package Employee2;

import java.time.LocalDate;

public class Employee2Main {
    public static void main(String[] args) {
        Employee2 e = new Employee2("Michael", 60000, LocalDate.of(2015, 5, 10));
        e.displayInfo();
    }
}
