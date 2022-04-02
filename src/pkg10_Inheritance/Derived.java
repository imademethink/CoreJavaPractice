package pkg10_Inheritance;

class Base{
    String empID    = "Sales100";
    String location = "London";
    public int ProcessSalary(String designation){
        if (designation.equals("manager")){
            return 10000;
        }else{
            return 6800;
        }
    }
//    public static void main(String[] args) {
//        System.out.println("main");
//    }
}

public class Derived extends Base{

    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println(d.empID);
        System.out.println(d.location);
        System.out.println(d.ProcessSalary("manager"));
    }

}
