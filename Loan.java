/**
 * Created by joanchen on 8/28/17.
 */
public class Loan {

    private Person person;
    private Book book;

    public Loan(Person person, Book book) {
        this.person = person;
        this.book = book;
        System.out.println(person.getFullName() + " checked out " + book.getTitle());
    }

}
