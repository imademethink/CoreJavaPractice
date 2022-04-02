package pkg11_InheritanceType;

public class Parent extends GrandParent{

    public void adviceMe(){
        System.out.println("Parental Advice");
    }

    public static void main(String[] args) {

        Parent p = new Parent();
        p.greetMe();
        p.adviceMe();
    }
}
