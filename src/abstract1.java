abstract class summa{
    abstract void greet();
    void meet()
    {
        System.out.println("meet");
    }

}
public class abstract1 extends summa{
    public static void main(String[] args) {
        summa su = new abstract1();
        su.greet();
        su.meet();
    }

    
    public void greet() { 
        System.out.println("abstract greeting ");
     }
    

}
