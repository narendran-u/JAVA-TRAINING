import java.util.HashMap;
import java.util.Map;

class Authordet {
    String authorFirstName;
    String lastName;

    
    Authordet() {
        System.out.println("Welcome to the author class");
    }

    
    Authordet(String authorFirstName, String lastName) {
        this.authorFirstName = authorFirstName;
        this.lastName = lastName;
    }

    void display() {
        System.out.println(authorFirstName + " " + lastName);
    }

    @Override
    public String toString() {
        return authorFirstName + " " + lastName;
    }
}


class Bookdet {
    int bookNo;
    float price;

    Bookdet() {
        System.out.println("Welcome to the book class");
    }

    Bookdet(int bookNo, float price) {
        this.bookNo = bookNo;
        this.price = price;
    }

    void display() {
        System.out.println(bookNo + " " + price);
    }

    @Override
    public String toString() {
        return bookNo + " " + price;
    }
}

public class Hshmap {
    public static void main(String[] args) {
        HashMap<Authordet, Bookdet> hm = new HashMap<>();
        hm.put(new Authordet("naren", "dran"), new Bookdet(101, 100.00f));
        hm.put(new Authordet("madhav", "krishnan"), new Bookdet(102, 100.00f));
        hm.put(new Authordet("prashanth", "G"), new Bookdet(103, 100.00f));
        hm.put(new Authordet("Rohan", "uss"), new Bookdet(104, 100.00f));

        
        for (Map.Entry<Authordet, Bookdet> entry : hm.entrySet()) 
        {
            Authordet author = entry.getKey();
            Bookdet bookdet = entry.getValue();

            System.out.println("Author: " + author + ", Bookdet: " + bookdet);
        }
    }
}
