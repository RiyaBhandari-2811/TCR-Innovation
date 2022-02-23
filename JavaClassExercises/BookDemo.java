
// Continue Write a separate class BookDemo with a main() method creates a Book
// titled “Developing Java Software” with authors Russel Winderand price
// 79.75. Prints the Book’s string representation to standard output (using
// System.out.println).

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Developing Java Software" , "Russel Winderand" ,79.75);
        System.out.println(b1.toString()); 
    }   
}