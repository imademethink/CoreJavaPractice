package pkg10_Inheritance;

class BasicModel{
    int wheels             = 4;

    String movingMechanism = "L4_Cylinder";

    public void IncreaseSpeed(){
        System.out.println("Move wheels");
    }

    public void ApplyBreak(){
        System.out.println("Stop wheels rotation");
    }
}

public class Car extends BasicModel{

    public static void main(String[] args) {
        Car audi = new Car();

        System.out.println(audi.wheels);
        System.out.println(audi.movingMechanism);
        audi.IncreaseSpeed();
    }
}
