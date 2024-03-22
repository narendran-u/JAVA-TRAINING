public class complex {
    int real,img;
    complex()
    {
        System.out.println("this is the real and img number");
    }
    complex(int a)
    {
        real=a;
    }
    /**
     * @param a
     * @param b
     */
    complex(int a,int b)
    {
        this(a);
        img=b;
    }
    complex(complex c)
    {
        this.real=c.real;
        this.img=c.img;

    }
    complex add(complex c1,complex c2){
        complex c3=new complex();
        c3.real=c1.real+c2.real;
        c3.img=c1.img+c2.img;
        return c3;
    }
 public static void main(String[] args) {
    complex obj=new complex();
    complex obj1=new complex(5);
    complex obj2=new complex(5,6);
    System.out.println("complex1: "+obj2.real+"+i"+obj2.img);
    complex obj4=new complex(5,4);
    System.out.println("complex2: "+obj4.real+"+i"+obj4.img);
    complex obj3 = new complex();
    obj3=obj3.add(obj2,obj4);
    System.out.println("Sum: "+obj3.real+"+i"+obj3.img);
 

}
}
