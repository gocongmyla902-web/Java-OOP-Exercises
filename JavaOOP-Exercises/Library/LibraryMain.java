package Library;

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java Programming");
        lib.addBook("Data Structures");
        lib.showBooks();
        lib.removeBook("Java Programming");
        lib.showBooks();
    }
}
