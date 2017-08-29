/**
 * Created by joanchen on 8/28/17.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int numBooks;
    private Membership membership;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numBooks = 0;
        this.membership = new StandardMember();
    }

    public void borrow(Book book) {
        if(membership.canBorrow(this)) {
            Loan loan = new Loan(this, book);
            numBooks++;
        } else {
            System.out.println("Sorry, " + firstName + " cannot checkout " + book.getTitle());
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getNumBooks() {
        return numBooks;
    }

    public void setMembership(Membership ms) {
        this.membership = ms;
    }
}
