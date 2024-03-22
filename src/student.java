public class student {
    int rollno;
    String name;
    String clg;
    student()
    {
        System.out.println("welcome to college");
    }
    student(int rollno)
    {
       this();
       this.rollno=rollno;
    }
    student (int rollno,String name)
    {

        this(rollno);
        
        this.name=name;
    }
    student(int rollno,String name,String clg)
    {
        this(rollno,name);
        this.clg=clg;


    }

    student(int ...m)
    {
        this();
        int max=m[0];
        for(int i=1;i<m.length;i++)
        {
            if(m[i]>max)
            {
                max=m[i];
            }
        }
        System.out.println(max);
    }
    
    public static void main(String[] args) {
        student obj1=new student();
        student obj2=new student(5);
        System.out.println(obj2.rollno);
        student obj3=new student(5,"naren");
        System.out.println("rollno: "+obj3.rollno+"name: "+obj3.name);
        student obj4=new student(5,"abc","kcg");
        System.out.println(obj4.rollno+obj4.name+obj4.clg);
        student obj5=new student(2,4,6,7,6);

        
        
    }


}
