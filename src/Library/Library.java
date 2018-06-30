package Library;

import Library.Book;
import Library.Author;

import java.util.Arrays;
import java.util.Scanner;

public class Library{
    private Book[] books;
    private String nazwa;


    public Library(String nazwa){
        this.nazwa = nazwa;
    }

    public String toString() {
        return Arrays.toString(books);
    }

    public String findBookByName(){
        for (int i = 0; i < books.length ; i++) {
            if (books[i].equals(nazwa)) {
               break;
            }
        }
        return books.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nazwa = scan.nextLine();
        Library library = new Library(nazwa);

        library.books = new Book[] {
            new Book("Ostatnie Życzenie", 30, 5, new Author("Andrzej Sapkowski", "Sapko123", 'm')),
                new Book("Chleb", 25, 2, new Author("Janusz Jaki", "Chlebiarz",'f'))
        };
    }

}
