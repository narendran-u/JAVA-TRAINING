import java.util.TreeSet;
class Details implements Comparable<Details>
{
    int Rollno;
    char grade;
    String name;
    Details()
    {
        System.out.println("welcomme");
    }
    Details(int Rollno,char grade,String name)
    {
        this.Rollno=Rollno;
        this.grade=grade;
        this.name=name;

    }
    void display()
    {
        System.out.println("Rollno "+this.Rollno+"grade "+this.grade+"name "+this.name);

    }
    public int compareTo(Details d)
    {
        if(this.grade>d.grade)
        {
            return 1;
        }
        else if(this.grade==d.grade)
        {
            return 0;
        }
        return -1;
        
    }
    public String toString() {
        return "Rollno: " + Rollno + ", Grade: " + grade + ", Name: " + name;
    }

}
public class Tset {

    public static void main(String[] args) {
        TreeSet<Details> t=new TreeSet<>();
        t.add(new Details(101,'a',"naren"));
        t.add(new Details(104,'a',"madhav"));
        t.add(new Details(102,'b',"prashanth"));
        t.add(new Details(103,'a',"rohan"));
        for(Details i:t)
        {
            System.out.println(i);
        }
        

    }
}
