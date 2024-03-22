class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
        System.out.println("employee");
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setEmployeeDetails(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setEmployeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void setEmployeeDetails(int id) {
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println();
    }
}
public class program {

        public static void main(String[] args) {
            Employee employee1 = new Employee();
            employee1.setEmployeeDetails("naren", 101, 50000);
            System.out.println("Details for Employee 1:");
            employee1.displayDetails();

            Employee employee2 = new Employee();
            employee2.setEmployeeDetails("dran", 102,90000);
            System.out.println("Details for Employee 2:");
            employee2.displayDetails();

            Employee[] employees = {
                new Employee("mahi", 80, 70000),
                new Employee("madhav", 75, 98888)
            };
            for(Employee employee:employees)
            {
                System.out.println("Details for Employee:");
                employee.displayDetails();

            }
        }
    
    

}
