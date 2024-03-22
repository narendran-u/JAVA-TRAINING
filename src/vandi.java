interface Engine {
    void start();
    void stop();
}
interface Features {
    void accelerate();
    void brake();
}


abstract class Vehicle {
    private String model;

    
    public Vehicle(String model) {
        this.model = model;
        System.out.println("Creating a new vehicle model: " + model);
    }

    
    public String getModel() {
        return model;
    }
}


class Car extends Vehicle implements Engine, Features {
    
    public Car(String model) {
        super(model);
    }


    @Override
    public void start() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped.");
    }

    
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking.");
    }
}
public class vandi{
    public static void main(String[] args) {
        Car myCar = new Car("Sedan123");
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
        System.out.println("Model of the car: " + myCar.getModel());
    }
}