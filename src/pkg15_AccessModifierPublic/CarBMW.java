package pkg15_AccessModifierPublic;

// using public elements in other class but same package
public class CarBMW {

    public static void main(String[] args) {

        CarBasicModel cm2 = new CarBasicModel();

        System.out.println(cm2.basicModelType);

        cm2.Ignite();

    }
}
