package pkg12_Constructor;

public class Car {

    int wheels;
    int cost;
    String engineType;
    String model;
    boolean childLock;
    float efficiency;

    // Empty constructor (no-arg, empty body)
    Car (){ }


    // Parameterized constructor
    Car(int wheelsNew, int costNew,
        String engineTypeNew,String modelNew,
        boolean childLockNew,float efficiencyNew){

        wheels      = wheelsNew;
        cost        = costNew;
        engineType  = engineTypeNew;
        model       = modelNew;
        childLock   = childLockNew;
        efficiency = efficiencyNew;

    }

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.wheels     = 4;
        c1.cost       = 12500;
        c1.engineType = "4_Cylinder";
        c1.model      = "1986";
        c1.childLock  = true;
        c1.efficiency = 60.5f;


        Car c2 = new Car();
        c2.wheels     = 4;
        c2.cost       = 15000;
        c2.engineType = "6_Cylinder";
        c2.model      = "1947";
        c2.childLock  = true;
        c2.efficiency = 60.5f;


    Car c3 = new Car(4,15000,"6_Cylinder", "1947",true, 50.6f);
    Car c4 = new Car(4,16000,"4_Cylinder", "1967",true, 50.6f);

    }

}
