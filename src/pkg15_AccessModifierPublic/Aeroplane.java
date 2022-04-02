package pkg15_AccessModifierPublic;

// using public elements in same class

class AeroplaneBasicModel{
    public String basicModelType = "Turbine engine";

    public AeroplaneBasicModel(){
        System.out.println("AeroplaneBasicModel constructor");
    }

    public void TakeOff(){
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
