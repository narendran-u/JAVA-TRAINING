interface Person {
    void salaryCalculator();
    void working();
}


abstract class Edu {
    void greet() {
        System.out.println("Greetings from naren");
    }

    abstract void education();
}

class Emi {
    private double balanceAmount;
    private double interest;


    public Emi(double balanceAmount, double interest) {
        this.balanceAmount = balanceAmount;
        this.interest = interest;
    }


    public double getBalanceAmount() {
        return balanceAmount;
    }

    public double getInterest() {
        return interest;
    }

}


class Engineer extends Edu implements Person {
    public  static int engineerCount = 0;

    String engineerName;
    public double salary;
    public Emi emi;

    
    public Engineer(String engineerName, double salary, Emi emi) {
        this.engineerName = engineerName;
        this.salary = salary;
        this.emi = emi;
        engineerCount++;
    }

    
    @Override
    public void salaryCalculator() {
        System.out.println("Calculating salary for Engineer " + engineerName);
        
    }

    @Override
    public void working() {
        System.out.println("Engineer " + engineerName + " is working.");
        
    }

    
    @Override
    void education() {
        System.out.println( engineerName + " completed BE CSE");
        
    }

}


class Doctor extends Edu implements Person {
    public static int doctorCount = 0;

    String doctorName;
    public double salary;
    public Emi emi;
    public Doctor(String doctorName, double salary, Emi emi) {
        this.doctorName = doctorName;
        this.salary = salary;
        this.emi = emi;
        doctorCount++;
    }

    @Override
    public void salaryCalculator() {
        System.out.println("Calculating salary for Doctor " + doctorName);
        
    }

    @Override
    public void working() {
        System.out.println("Doctor " + doctorName + " is working.");
        
    }


    @Override
    void education() {
        System.out.println("Doctor " + doctorName + " is a cardiologist");
        
    }
}
public class main {
    public static void main(String[] args) {
        Emi engineerEmi = new Emi(50000, 7.5);
        Emi doctorEmi = new Emi(60000, 5.0);

        Engineer[] engineers = {
            new Engineer("naren", 80000, engineerEmi),
            new Engineer("madhav", 75000, engineerEmi)
        };

        Doctor[] doctors = {
            new Doctor("mahithosh", 100000, doctorEmi),
            new Doctor("prashanth", 90000, doctorEmi)
        };

        for (Engineer engineer : engineers) {
            engineer.greet();
            engineer.education(); 
            engineer.salaryCalculator(); 
            engineer.working(); 

            System.out.println("EMI Balance Amount for " + engineer.engineerName + ": " + engineer.emi.getBalanceAmount());
        }

        for (Doctor doctor : doctors) {
            doctor.greet();
            doctor.education(); 
            doctor.salaryCalculator(); 
            doctor.working();

            System.out.println("EMI Balance Amount for " + doctor.doctorName + ": " + doctor.emi.getBalanceAmount());
        }
    }
}
