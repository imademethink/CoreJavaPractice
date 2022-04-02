package pkg18_AccessModifierPrivate;

public class CarBasicModel {

    private String basicModelType = "KeyStart_4Cylinder";

    private CarBasicModel(){
        System.out.println("CarBasicModel constructor");
    }

    private void Ignite(){
        System.out.println("CarBasicModel Ignite");
    }

}
