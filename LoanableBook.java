/**
 * Created by joanchen on 8/29/17.
 */
public class LoanableBook extends Book {

    public LoanableBook(String uid, String title, String author, double price) {
        super(uid, title, author, price);
    }

    @Override
    public boolean isLoanable() {
        return true;
    }
}
