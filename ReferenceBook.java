/**
 * Created by joanchen on 8/29/17.
 */
public class ReferenceBook extends Book {

    public ReferenceBook(String uid, String title, String author, double price) {
        super(uid, title, author, price);
    }

    @Override
    public boolean isLoanable() {
        return false;
    }
}
