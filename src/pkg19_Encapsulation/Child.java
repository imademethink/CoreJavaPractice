package pkg19_Encapsulation;

public class Child extends Parent{

    public static void main(String[] args) {
        Child c = new Child();

        System.out.println(c.getKey("jon","jon123"));
        c.setKey(55,"jon","jon123");
        System.out.println(c.getKey("jon","jon123"));

    }

}


