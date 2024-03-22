class parent{
    void sampledet(String name,int id)
    {
        System.out.println(name+" "+id);
    }
    void run()
    {
        System.out.println("running from parent class");
    }
}

class child extends parent
{
    void run()
    {
        System.out.println("running from child class");
    }

    void samplechild(String name,int dob){
        System.out.println("Name: "+name+"\n"+"DOB: "+dob);
    }
}


public class SampleCasting {
    public static void main(String[] args) {
        try
        {
            parent p=new child();
            child c=(child) new parent();
            c.samplechild("Adam", 23);
        }
        catch(ClassCastException e)
        {
            System.out.println("Class Cast Error");
        }
        catch(Exception e)
        {
            System.out.println("");
        }
    }
}
