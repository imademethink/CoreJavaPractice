package pkg15_AccessModifierPublic;

// using public elements in other class but same package
// using extends keyword
public class CarFord extends CarBasicModel {

    public static void main(String[] args) {
        CarBasicModel cm3 = new CarBasicModel();

        System.out.println(cm3.basicModelType);

        cm3.Ignite();
    }
}
