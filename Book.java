/**
 * Created by joanchen on 8/28/17.
 */
public abstract class Book {

    private String uid;
    private String title;
    private String author;
    private double price;

    public Book(String uid, String title, String author, double price) {
        this.uid = uid;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String uid, String title, String author) {
        this.uid = uid;
        this.title = title;
        this.author = author;
        this.price = -1;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public abstract boolean isLoanable();



}
