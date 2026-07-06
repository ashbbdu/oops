package Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Library {


    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public String borrowBook(String title) {

        for(var book : books) {
            if(Objects.equals(book.getTitle(), title)) {
                System.out.println("Author " + book.getAuthor());
                book.setAvailable(false);
                return  "book is available ";

            }
        }
        return  "book is not available ";
    }

    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert Martin", true);
        Book b2 = new Book("Effective Java", "Joshua Bloch", true);
        Book b3 = new Book("Java Concurrency", "Brian Goetz", true);

        Library library = new Library();

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println(b1.isAvailable());
        System.out.println( library.borrowBook(b1.getTitle()));
        System.out.println(b1.isAvailable());
    }


    }

