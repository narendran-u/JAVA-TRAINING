class naanException extends Exception
{
    public naanException(String s)
    {
        super(s);
    }
}

class cc
{
    void get()throws Exception
    {
        System.out.println("hi from cc");
        try{
            throw new naanException("I am Exception");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class bb11 extends cc
{
    @Override
    void get() throws Exception
    {
        System.out.println("hi from bb");
        super.get();
    }
}

public class task1 {
    public static void main(String[] args) throws Exception{
        int a,b;
        int[] arr=new int[5];
    
        try{
            try{
                a=10;b=0;
                a=a/b;
            }
            catch (ArithmeticException e){
                System.out.println("cant divide by zero");
            }
            System.out.println(arr[6]);


        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ask correctly");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally{
            bb11 nb = new bb11();
            nb.get();
        }
        
    }

}
