
import java.util.ArrayList;
import java.util.List;

public class Test1 {

    /*
    Create a Bookshelf class that represents a collection of books. Implement methods to add a book, remove a book and display all the books on the bookshelf. Each book should have attributes such as title, author and genre. Write a program to test the Bookshelf class by adding and removing books as well as displaying the list of books on the bookshelf.



The output should look like this:

Books on the Bookshelf:

Title: To Kill a Mockingbird, Author: Harper Lee, Genre: Classic

Title: The Great Gatsby, Author: F. Scott Fitzgerald, Genre: Classic



Books on the Bookshelf:

Title: To Kill a Mockingbird, Author: Harper Lee, Genre: Classic

Title: Harry Potter and the Sorcerer's Stone, Author: J.K. Rowling, Genre: Fantasy

     */

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();

        bookshelf.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "Classic"));
        bookshelf.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic"));


        bookshelf.displayBooks();

        bookshelf.removeBook("The Great Gatsby");

        bookshelf.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy"));
        bookshelf.displayBooks();

        //bookshelf.removeBook("Harry Potter and the Sorcerer's Stone");

        //bookshelf.displayBooks();

        //bookshelf.removeBook("To Kill a Mockingbird");

        //bookshelf.displayBooks();

        //bookshelf.removeBook("The Great Gatsby");

        /*bookshelf.displayBooks();

        bookshelf.removeBook("Harry Potter and the Sorcerer's Stone");

        bookshelf.displayBooks();*/

        //bookshelf.removeBook("To Kill a Mockingbird");
    }

    public static class Bookshelf {
        private List<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public void removeBook(String title) {
            for (Book book : books) {
                if (book.getTitle().equals(title)) {
                    books.remove(book);
                    break;
                }
            }
        }

        public void displayBooks() {
            System.out.println("Books on the Bookshelf:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Genre: " + book.getGenre());
            }
            System.out.println();
        }
    }
}