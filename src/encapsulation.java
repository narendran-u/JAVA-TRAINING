class Student123{
    private int  balance, id;
    void setbalance(int balance){
        this.balance=balance;
    }
    void setid(int  id){
        this.id=id;
    }
    int  getbalance()
    {
        return this.balance;
    }
    int  getid(){
        return this.id;
    }
    
}

public class encapsulation {
    public static void main(String[] args) {
        Student123 s=new Student123();
        s.setbalance(1000);
        s.setid(1101);
        System.out.println(s.getbalance());
        System.out.println(s.getid());
    }
}
