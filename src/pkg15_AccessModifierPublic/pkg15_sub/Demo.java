package pkg15_AccessModifierPublic.pkg15_sub;

import pkg15_AccessModifierPublic.CarBasicModel;

// using public elements in other class and other package

public class Demo {

    public static void main(String[] args) {

        CarBasicModel cm3 = new CarBasicModel();

        System.out.println(cm3.basicModelType);

        cm3.Ignite();
    }

}
