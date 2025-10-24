package Person;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Myla", 25);
        Person p2 = new Person("Bob", 30);
        p1.displayInfo();
        p2.displayInfo();
        p1.setAge(26);
        System.out.println(p1.getName() + " is now " + p1.getAge());
    }
}
