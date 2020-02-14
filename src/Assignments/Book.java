package Assignments;

public class Book {

    private String bookName;
    private int price;
    private int quantity;
    private Author author;
    private int year;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Book(String bookName, int price, int quantity, Author author, int year) {
        this.bookName = bookName;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
}

