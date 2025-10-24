package Library;

import java.util.ArrayList;
import java.util.List;

    public class Library {
    private List<String> books = new ArrayList<>();

    public List<String> getBooks() { return books; }
    public void addBook(String book) { books.add(book); }
    public void removeBook(String book) { books.remove(book); }
    public void showBooks() { System.out.println("Books in Library: " + books); }
}

