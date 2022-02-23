
// Problem Statement : 5. Write a Java class Book with following features:

// Instance variables :
//   title for the title of book of type String.
//   author for the author’s name of type String.
//   price for the book price of type double.

// Constructor:
//   public Book (String title, Author name, double price): A constructor
//   with parameters, it creates the Author object by setting the the fields to the
//   passed values.

// Instance methods:
//   public void setTitle(String title): Used to set the title of book.
//   public void setAuthor(String author): Used to set the name of author
// of book.
//   public void setPrice(double price): Used to set the price of book.
//   public double getTitle(): This method returns the title of book.
//   public double getAuthor(): This method returns the author’s name of
// book.
//   public String toString(): This method printed out book’s details to the
// screen
// Write a separate class BookDemo with a main() method creates a Book
// titled “Developing Java Software” with authors Russel Winderand price
// 79.75. Prints the Book’s string representation to standard output (using
// System.out.println).

public class Book {

    private String title, author;
    private double price;

    public Book(String title, String author, double price) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return " Title : \""+ this.title + "\"" + " , written by : " + this.author + " ,  Price : " + this.price;
    }

}


