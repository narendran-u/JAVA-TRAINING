class aggregation {
    String name;
    int id;

    void get(String n, int i) {
        this.name = n;
        this.id = i;
    }
}

class A {
    void printData(aggregation a) {
        System.out.println(a.name + " " + a.id);
    }
}

class BB extends A {
    void printData(aggregation b) {
        System.out.println(b.name + " " + b.id);
    }
}

public class task {
    public static void main(String[] args) {
        aggregation ag = new aggregation();
        ag.get("Name", 1);

        A ca = new A();
        ca.printData(ag);

        BB cb = new BB();
        cb.printData(ag);
    }
}
