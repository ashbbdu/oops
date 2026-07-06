package Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//You are tasked to design a class Book to manage the book details in a library. The class should contain the following specifications :
//
//Attributes :
//
//title (list<string>) : The title of the book (public).
//author (list<string>) : The author of the book (public)
//isAvailable (list<Boolean>) : The availability status of the book (private).
//Methods :
//
//Parameterised constructor to initialize the title, author, isAvaialble list.
//borrowBook(string bookName) : If the availability status for book 'bookName' is true then the book can be borrowed, Once borrowed mark its status as false. If availability status for book 'bookname' is false then the book is already borrowed by some user and cannot be borrowed until its returned, so print "Book is not available.".
//returnBook (string bookName) : The book with bookName is returned and should be marked as available by setting its available flag to true.
//getAvailability (string bookName) : Prints the availability status of the book with name 'bookName' (true for available , false for unavailable).
//
//
//Refer the sample example to understand the output format.
//
//Refer the commented code on IDE to view the output statements.
//
//
//
//The Input is provided as mentioned below :
//
//        "1 <book name>" - represents call to borrowBook method along with name of the book to borrow.
//
//"2 <book name>" - represents call to returnBook method along with name of the book to return.
//
//        "3 <book name>" - represents call to getAvailability method along with name of book.
//
//
//Example 1
//
//Input : title = [ "Sherlock_Holmes", "Frankenstein", "King_Arthur_and_the_Round_Table", "Treasure_Island" ]
//
//author = [ "Arthur_Conan_Doyle", "Mary_Shelley", "Roger_Lancelyn_Green", "Robert_Louis_Stevenson" ]
//
//isAvailable = [ "false", "true", "false", "false" ]
//
//methodCalls = [ ["1", "Frankenstein"] , ["1", "Sherlock_Holmes"] , ["2", "King_Arthur_and_the_Round_Table"], ["3", "Sherlock_Holmes"], ["1", "Frankenstein"] ]
//
//
//
//Output :
//
//Book is not available.
//
//        false
//
//Book is not available.
//
//
//
//Explanation :
//
//Program creates a object with the arguments title, author and isAvailable list.
//It then takes the methodCalls array as input.
//Iterate over the methodCalls array and gives call to the appropriate methods from the class Book.
//The first operation is to borrow the book named "Frankenstein". As the book is available then it can be borrowed.
//
//The second operation is to borrow book named "Sherlock Holmes". As the book is not available so we print "Book Not Available".
//
//The third operation is to return the book named "King_Arthur_and_the_Round_Table".
//
//The fourth operation we need the availability status of book named "Sherlock_Holmes", which is false.
//
//The fifth operation is to borrow the book named "Frankenstein". The book was already borrowed in 1st operation and not returned yet. So the availability status is false and So we print "Book Not Available".
//
//public class Book {
//    public List<String> title ;
//    public List<String> author ;
//    private List<Boolean> isAvailable;
//
//
//    Book (List<String> title , List<String> author , List<Boolean> isAvailable) {
//        this.title = title;
//        this.author = author;
//        this.isAvailable = isAvailable;
//    }
//
//
//    public List<String> getTitle () {
//        return title;
//    }
//
//    public String borrowBook (String bookName) {
//        if(title.contains(bookName)) {
//            System.out.println("Book is available to borrow !");
//            System.out.println();
//
//        } else {
//            System.out.println("Book is not available to borrow !");
//        }
//
//        return "hii";
//    }
//
//    public static void main(String[] args) {
//        Book b1 = new Book(List.of("Test" , "test1") , List.of("as" , "asfd") , List.of(true , true));
//        System.out.println(b1.borrowBook("Test"));
//    }
//}


public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


}