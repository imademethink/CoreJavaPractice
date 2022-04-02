package pkg04_Class;
// 4
public class Employee {
    // instance variable
    String  name;
    boolean gender;
    int     salary;
    String  designation;
    String  address;

    // static variable
    static String companyName = "Dell";
    static String empId;

    public static void main(String[] args)
    {
//        String name2 = "London";
//
//        // local variable
//        int bonus = 0;
//
        // Variable of Employee class = new Object of Employee class
        Employee emp = new Employee();
        Employee emp2 = new Employee();

        // accessing instance variable via object name
        emp.name     = "Lily";
        emp2.name    = "Jon";
        emp.gender   = false;
        emp.salary   = 10000;
        emp.designation= "Manager";
        emp.address  = "MG Street";

        // accessing static variable - via classname
        Employee.empId = "Sales200";
        Employee.companyName = "Abc company";

//        bonus = emp.calculateBonus(emp.salary, emp.designation);

//        System.out.println(bonus);
//
//
//        String city = "London";
//        city.length();

    }

    public int calculateBonus(int salary, String  designation){
        Employee emp = new Employee();
//      instance variable from non static context
//        name     = "July";
        // local variable
        int bonusValue = 0;
        if ( designation.equals("Manager") && salary >= 10000){
            bonusValue = 900;
        }
        else {
            bonusValue = 500;
        }

        return bonusValue;
    }

}
