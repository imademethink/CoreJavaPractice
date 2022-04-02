package pkg21_Abstract;

public class VehicleMotorcycle extends Vehicle {

    @Override
    public void IgniteEngine(){
        System.out.println("Init spark plug");
    }

    public void IncreaseSpeed(){
        System.out.println("Increasing speed to 15 units");
    }

    public void DecreaseSpeed(){
        System.out.println("Decreasing speed to 7 units");
    }

    public static void main(String[] args) {

        VehicleMotorcycle ducati = new VehicleMotorcycle();

        ducati.IgniteEngine();
        ducati.IncreaseSpeed();
        ducati.DecreaseSpeed();
    }

}
