package pkg17_AccessModifierDefault;

// using default elements in same class

class AeroplaneBasicModel{
    String basicModelType = "Turbine engine";

    AeroplaneBasicModel(){
        System.out.println("AeroplaneBasicModel constructor");
    }

    void TakeOff(){
        System.out.println("AeroplaneBasicModel TakeOff");
    }
}

public class Aeroplane {

    public static void main(String[] args) {
        AeroplaneBasicModel ab = new AeroplaneBasicModel();

        System.out.println(ab.basicModelType);

        ab.TakeOff();
    }

}
