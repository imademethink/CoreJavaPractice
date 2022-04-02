package pkg18_AccessModifierPrivate;

// using private elements in same class - not possible

class AeroplaneBasicModel{
    private String basicModelType = "Turbine engine";

    private AeroplaneBasicModel(){
        System.out.println("AeroplaneBasicModel constructor");
    }

    private void TakeOff(){
        System.out.println("AeroplaneBasicModel TakeOff");
    }
}

public class Aeroplane {

    public static void main(String[] args) {
//        AeroplaneBasicModel ab = new AeroplaneBasicModel();
//
//        System.out.println(ab.basicModelType);
//
//        ab.TakeOff();
    }

}
