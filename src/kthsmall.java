import java.util.Arrays;
class test{
    public void ttest(){
        System.out.println("hello");
    }
}
public class kthsmall {
    public static int kthSmallest(int[] arr, int l,int k) 
    { 
        
        Arrays.sort(arr);
        return arr[k-1];
    } 
    public static void main(String[] args) {
       // int[] arr=new int[]{9,4,3,2,5};
        //complex c = new complex();
        //int l=arr.length;
        //int k=3;
        //System.out.println(kthSmallest(arr,l,k));
        test t=new test();
        t.ttest();

    }

}
