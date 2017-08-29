/**
 * Created by joanchen on 8/28/17.
 */
public class Membership {
    protected int numOfBooksAllow;

    public boolean canBorrow(Person person) {
        if(person.getNumBooks() < numOfBooksAllow) {
            return true;
        }
        return false;
    }
}
