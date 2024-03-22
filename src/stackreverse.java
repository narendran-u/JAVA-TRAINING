import java.util.Stack;

public class stackreverse {
    static void insert(Stack<Integer> s,int temp)
    {
        if(s.isEmpty())
        {
            s.push(temp);
            return;
        }
        int temp1=s.pop();
        insert(s, temp);
        s.push(temp1);
        
    }
    static void reverse(Stack<Integer> s)
    {
        if(!s.isEmpty())
        {
            int temp=s.pop();
            reverse(s);
            insert(s,temp);

        }

    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        for(int i=1;i<=5;i++)
        {
            s.push(i);
        }
        reverse(s);
        
        System.out.println(s);
        
    }

}
