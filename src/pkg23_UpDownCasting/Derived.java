package pkg23_UpDownCasting;

public class Derived extends Base {

    @Override
    public void Talk(){
        System.out.println("Talk about Science");
    }

    public static void main(String[] args) {

        // Up-casting
        // variable of Base class = new Object of Derived class
        Base b = new Derived();
        b.Talk();


        Derived d2 = new Derived();
        Base b2    = d2;
        // Down-casting
        Derived d3 = (Derived)b2;  // <<== down casting derived class
        d3.Talk();

    }
}
