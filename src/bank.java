/**
 * Innerbank
 */
 interface Innerbank {
    int  fact(int n);

    
}
/**
 * Innerbank_1
 */
class b implements Innerbank {

   
 public int fact(int n)
 {
    while(n>1)
    {
    n= n*fact(n-1);}
    return n;
 }

}

public class bank {
    public static void main(String[] args) {
    b bb=new b();
    System.out.println(bb.fact(5));

    }

}
