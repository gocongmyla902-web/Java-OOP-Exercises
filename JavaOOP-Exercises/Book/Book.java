package Book;

import java.util.ArrayList;
import java.util.List;

    public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) { this.title = title; this.author = author; this.ISBN = ISBN; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getISBN() { return ISBN; }
    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) { books.add(book); System.out.println(book.getTitle() + " added."); }
    public void removeBook(Book book) { books.remove(book); System.out.println(book.getTitle() + " removed."); }
    public List<Book> getBooks() { return books; }

    public void showBooks() {
        System.out.println("Library Collection:");
        for (Book b : books) b.displayBook();
    }
}

