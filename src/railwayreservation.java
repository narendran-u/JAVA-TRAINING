import java.util.Scanner;
class book
{
    private String name;
    private int age;
    private String p;
    book()
    {
        System.out.println("welcome to booking");
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getP() {
        return p;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age cannot be negative.");
        }
    }

    public void setP(String p) {
        this.p = p;
    }
}
    
    

}
class cancel{

}
class viewbookedticket
{

}
class available
{
    public int u,m,l;
    u=3;
    m=3;l=3;

    

}
public class railwayreservation {

public static void main(String[] args) {
    int n;
    System.out.println("1.book 2.cancel 3.viewbooked ticket  4.view available ticket  5.exit");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    switch(n)
    {
        case 1:
        {
           
        }
        case 2:
        {
            
        }
        case 3:
        {
            
        }
        case 4:
        {

        }
        case 5:
        {

        }
        default:
        {
            System.out.println("rohan");
        }
}
}
