package pkg16_AccessModifierProtected;

public class CarBasicModel {

    protected String basicModelType = "KeyStart_4Cylinder";

    protected CarBasicModel(){
        System.out.println("CarBasicModel constructor");
    }

    protected void Ignite(){
        System.out.println("CarBasicModel Ignite");
    }

}
