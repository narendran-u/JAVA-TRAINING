import java.util.*;
interface iphonefeatures
{
  void features();

}
interface androidfeatures
{
    void features();
}
class iphone implements iphonefeatures
{

    
    public void features()
    {
        System.out.println("facetime ");
        System.out.println("appstore");
        System.out.println("siri is here");
    }
}
class android implements androidfeatures
{
    public void features()
    {
        System.out.println("mod apk supported ");
        System.out.println("can use developer option");
        System.out.println("fingerprint is there");
    }

}
class hybridphone implements iphonefeatures,androidfeatures
{
    public void features()
    {
        System.out.println("facetime ");
        System.out.println("appstore");
        System.out.println("siri is here");
        System.out.println("mod apk supported ");
        System.out.println("can use developer option");
        System.out.println("fingerprint is there");
    }

}
public class phone {
    public static void main(String[] args) {
    iphone i=new iphone();
    android a=new android();
    hybridphone h=new hybridphone();
        
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    switch(n)
    {
        case 1:
        {
            i.features();
            break;
        }
        case 2:
        {
            a.features();
            break;
        }
        case 3:
        {
            h.features();
            break;
        }
        default:
        {
            System.out.println("rohan");
        }
            
    }


    }

}
