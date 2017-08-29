/**
 * Created by joanchen on 8/28/17.
 */
public class Main {

    public static void main(String[] args) {
        //Book t1 = new Book("T1", "Binge", "Tyler Oakley", 24.00);
        Book t1 = new LoanableBook("T1", "Binge", "Tyler Oakley", 24.00);
        Book t2 = new ReferenceBook("T2", "The Night Circus", "Erin Morgenstern", 16.99);
        Book t3 = new LoanableBook("T3", "Tales of Two City", "Charles Dicken", 3.99);

        Person john = new Person("John", "Doe");
        //System.out.println(john.getFullName());
        Person junior = new Person("John Junior", "Doe");
        junior.setMembership(new JuniorMember());

        john.borrow(t1);
        john.borrow(t2);

        junior.borrow(t1);
        junior.borrow(t3);

    }
}
