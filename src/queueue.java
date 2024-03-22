public class queueue {
    static int qpeek(int[] a,int top)
    {
        return a[top];
    }

    static int[] qadd(int[] a,int e,int top)
    {
        int n=a.length;
        if(top>n)
        {
            System.out.println("Overflow");
        }
        else{
            a[top+1]=e;
        }
        return a;
    }

    static int[] qpop(int[] a,int top)
    {
        if(top<0)
        {
         System.out.println("Underflow");
        }
        else{
            for(int i=0;i<top;i++)
            {
                a[i]=a[i+1];
            }
            top--;
        }
        
        return a;
    }
    public static void main(String[] args) {
        
        int[] a=new int[5];
        int top=-1;
        for(int i=1;i<=5;i++)
        {
            qadd(a, i, top);
            top++;
        }
        
        qpop(a, top);
        for(int i=0;i<top;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
