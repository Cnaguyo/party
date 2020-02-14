package Assignments;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {


        Author author = new Author(" Koen ", " koen.griffioen@capgemini.com", 26, " m ");
        Author author2 = new
                Author(" Alice Munro ", " not indicated ", 88, " f ");

        Book book = new Book(" Thoughts on Java ", 199, 1, author, 2020);
        Book book2 = new Book(" Thoughts on Dotnet ", 499, 2, author, 2020);
        Book book3 = new Book(" Selected Stories ", 1699, 1500,author2,2020);
        Book book4 = new Book(" The moons of jupiter ", 1499, 1000, author2, 2020);

        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        for (Book b:books){

            System.out.println(b.getAuthor());
            System.out.println(b.getBookName());
            System.out.println(b.getPrice());
            System.out.println(b.getQuantity());
            System.out.println(b.getYear());


        }
    }
}
