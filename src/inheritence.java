 class vehicle
{
    vehicle(){
        System.out.println("Vehicle type");
    }

    void details(){
        String nPlate="1234";
        String rcbook="0000";
        String cc="155";
        System.out.println(nPlate+" "+rcbook+" "+cc);
    }

}
class bike extends vehicle{
    private bike(){
        System.out.println("Bike Details");
    }
    

    public static bike details(){
        return new bike();
        /*super.details();
        String brand = "Yamaha";
        String model = "MT15";
        System.out.println(brand+" "+model);
    */}
}
public class inheritence{
    public static void main(String[] args) {
        bike.details();
    }


}
