import java.util.Stack;

public class siab{
    static void insertattop(Stack<Integer> s,int temp)
    {
        if(s.isEmpty())
        {
            s.push(temp);
            return;
        }
        int temp1=s.pop();
        insertattop(s, temp);
        s.push(temp1);
        
    }

    static void deleteatbottom(Stack<Integer> s)
    {
        int sn=s.size();
        if(sn==1)
        {
            s.pop();
            return;
        }
        int temp1=s.pop();
        deleteatbottom(s);
        s.push(temp1);
        
    }
    
    
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        for(int i=1;i<=5;i++)
        {
            s.push(i);
        }
        System.out.println(s);
       // insertattop(s, 6);
       deleteatbottom(s);
        System.out.println(s);
    }

}
