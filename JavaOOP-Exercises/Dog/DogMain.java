package Dog;

public class DogMain {
    public static void main(String[] args) {
        Dog d1 = new Dog("Max", "Bulldog");
        Dog d2 = new Dog("Bella", "Beagle");
        d1.setName("Charlie");
        d1.setBreed("Golden Retriever");
        d1.displayInfo();
        d2.displayInfo();
    }
}
