package Library;

public class Book {
    private String bookname;
    private float price;
    private int quantity;
    private Author author;

    public Book(String bookname, float price, int quantity, Author author) {
        this.bookname = bookname;
        this.price = price;
        this.quantity = quantity;
        this.author = author;
    }

    public void setBname(String bname) {
        this.bookname = bname;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBname() {
        return bookname;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Author getAuthor() {
        return author;
    }
}
