package pkg16_AccessModifierProtected;

// using protected elements in same class

class AeroplaneBasicModel{
    protected String basicModelType = "Turbine engine";

    protected AeroplaneBasicModel(){
        System.out.println("AeroplaneBasicModel constructor");
    }

    protected void TakeOff(){
        System.out.println("AeroplaneBasicModel TakeOff");
    }
}

public class Aeroplane{

    public static void main(String[] args) {
        AeroplaneBasicModel ab = new AeroplaneBasicModel();

        System.out.println(ab.basicModelType);

        ab.TakeOff();
    }

}
