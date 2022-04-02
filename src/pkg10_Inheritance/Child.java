package pkg10_Inheritance;

class Parent{
    String bodyFeatures= "Eyes";
    int propertyValue  = 50000;

    public void CommunicationSkills(){
        System.out.println("Hello World");
    }
}

public class Child extends Parent{

    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.bodyFeatures);
        System.out.println(c.propertyValue);
        c.CommunicationSkills();
    }
}
