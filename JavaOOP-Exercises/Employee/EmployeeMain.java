package Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e = new Employee("John", "Developer", 50000);
        e.displayInfo();
        System.out.println("Annual Salary: " + e.getAnnualSalary());
        e.updateSalary(55000);
        System.out.println("Updated salary: " + e.getSalary());
    }
}
