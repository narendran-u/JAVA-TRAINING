class Debit
{
    private int bal;
    void setbalance(int bal)
    {
        this.bal=bal;
    }
    int getbalance(){
        return bal;
    }
    void debit(int amt)
    {
        bal=bal-amt;
        System.out.println("balance is: "+bal);

    }

}
class Credit
{
    private Debit d;
    int bal;
    Credit(Debit d)
    {
    this.d=d;
    bal = d.getbalance();
    }
    void credit(int amt)
    {
        bal=bal+amt;
        System.out.println("balance is: "+bal);
    }


}
public class creditdebit {
    public static void main(String[] args) {
        Debit d1 = new Debit();
        d1.setbalance(2000);
        d1.debit(500);
        Credit c1= new Credit(d1);
        c1.credit(1000);
    }
}
