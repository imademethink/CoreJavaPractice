package pkg04_Class;
// 2
public class Car
{

    String name = "Audi";
    String color = "Red";

    public static void main(String[] args) {

        boolean handsFreeMode = false;

        // Variable of Car class = new Object of Car class
        Car Ferrari = new Car();
        Ferrari.IncreaseSpeed();
        Ferrari.DecreaseSpeed();
        Ferrari.Honking();
        Ferrari.SetHandsFreeMode(true);
        Ferrari.name = "My Audi";
        Ferrari.color = "White";
    }

    public void Honking(){
        System.out.println("Horn OK Please");
    }

    public void IncreaseSpeed(){
        System.out.println("Increasing speed to 15 units");
    }

    public void DecreaseSpeed(){
        System.out.println("Decreasing speed to 7 units");
    }

    public void SetHandsFreeMode(boolean newMode){
        System.out.println("Setting hands free mode as " + newMode);
    }

}
