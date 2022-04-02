package pkg11_InheritanceType;

public class Child extends Parent{

    public void playWithMe(){
        System.out.println("Play with child");
    }

    public static void main(String[] args) {

        Child c = new Child();

        c.greetMe();
        c.adviceMe();
        c.playWithMe();
    }

}
