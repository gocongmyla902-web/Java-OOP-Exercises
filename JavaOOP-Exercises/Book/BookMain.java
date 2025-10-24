package Book;

public class BookMain {
    public static void main(String[] args) {
        Library lib = new Library();
        Book b1 = new Book("Java Basics", "John Doe", "12345");
        Book b2 = new Book("OOP in Java", "Jane Smith", "67890");
        lib.addBook(b1);
        lib.addBook(b2);
        lib.showBooks();
        b1.setTitle("Java Basics - 2nd Ed");
        lib.removeBook(b1);
        lib.showBooks();
    }
}

