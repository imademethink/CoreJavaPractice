package pkg05_NonAccessModifier;
// 1
public class Employee {

    String  name;
    boolean gender;
    int     salary;
    String  designation;
    String  address;

    static String  empId;   // static variable
    static String  temp;


    public static void main(String[] args) {
        int bonus = 0;

        Employee emp = new Employee();
        emp.name     = "Lily";
        emp.gender   = false;
        emp.salary   = 10000;
        emp.designation= "Manager";
        emp.address  = "MG Street";

        // calling normal or non-static method
        bonus = emp.calculateBonus(emp.salary, emp.designation);
        System.out.println(bonus);

        // static
        // advantage - one time memory allocation
        //           - no need to create object of the class and assign memory to all variables
        // disadvantage - memory allocation till the end of the program

        // static variable
        Employee.empId = "Sales_200";
        Employee.empId = "Sales_206";
        // calling static method
        bonus = Employee.simpleBonus(emp.salary, emp.designation);
        System.out.println(bonus);
        // having a local variable which is same as class variable
//        String  temp="123";
//        System.out.println(temp);
    }


    // non static method
    public int calculateBonus(int salary, String  designation){
        int bonusValue = 0;
        if ( designation.equals("Manager") && salary >= 10000){
            bonusValue = 900;
        }
        else {
            bonusValue = 500;
        }
        return bonusValue;
    }


    // static method
    public static int simpleBonus(int salary, String  designation){
        int bonusValue = 0;
        if ( designation.equals("Manager") && salary >= 10000){
            bonusValue = 900;
        }
        else {
            bonusValue = 500;
        }
        return bonusValue;
    }

    // static block - will be executed first
    static
    {
        System.out.println("This is static block");
    }

}
