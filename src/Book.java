import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    /*
    Create a Java class called Book with the attributes title, author and yearPublished.
    Include a parameterised constructor to initialise these attributes.
    Create an array of 3 Book objects and fill it with books of your choice.
     Display the details of all the books in the array.

    Give the following values as input for the code:
    Title: Java: The Complete Reference
    Author: Herbert Schildt
    Year Published: 2021

    Title: Clean Code: A Handbook of Agile Software Craftsmanship
    Author: Robert C. Martin
    Year Published: 2008

    Title: The Alchemist
    Author: Paulo Coelho
    Year Published: 1988
     */
    private String title;
    private String author;

    private String genre;

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }



    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }


    public String getTitle() {
        return title;
    }
}

class source {
    public static void main(String args[]) throws Exception {



    }
}