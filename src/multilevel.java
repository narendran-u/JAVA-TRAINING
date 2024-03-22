class car
{
String model;
int mileage;
car()
{
System.out.println("lightning mcqueen is the best car");
}
car(String model,int n){
    this.model=model;
    mileage=n;
}
}
class tata extends car{
    String t1="SUV";
    String t2="Sedan";
    void print(){
        System.out.println("I am TATA");
        
    }
}
class punch extends tata{
    String EType;
    int seater,topspeed;
    void punchDet(){
        EType="Petrol";
        seater = 5;
        topspeed=200;
        System.out.println(EType+" "+seater+" "+super.t1+" "+topspeed);
    }

}
class harrier extends tata{
    String EType= new String();
    int seater,topspeed;
    void harrierDet(){
        EType="CNG";
        seater = 5;
        topspeed=150;
        System.out.println(EType+" "+seater+" "+super.t2+" "+topspeed);
    }

}
public class multilevel {
    public static void main(String[] args) {
        harrier h=new harrier();
        h.harrierDet();
        punch p= new punch();
        p.punchDet();
    }

}
