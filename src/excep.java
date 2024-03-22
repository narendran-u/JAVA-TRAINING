
public class excep {
    static void c()
    {
        System.out.println("3");
        int a=10/0;
        //throw new Exception("Handle me");
            
    }
    static void b()
    {
        System.out.println("2");
        c();
        System.out.println("B2");
    }
    static void a()
    {
        System.out.println("1");
        b();
        System.out.println("B1");
    }
    public static void main(String[] args) {
        System.out.println("welcome");
        try{
            a();
        }
        catch(Exception e)
        {
            System.out.println("handled");
        }
    }
}
