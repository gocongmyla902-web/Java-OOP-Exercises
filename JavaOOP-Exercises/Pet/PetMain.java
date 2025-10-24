package Pet;

public class PetMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 4, "Rubber Ball");
        Bird bird = new Bird("Sky", 2, 35.5);

        System.out.println(" Dog Details:");
        dog.displayPetDetails();

        System.out.println("\n Bird Details:");
        bird.displayPetDetails();
    }
}
