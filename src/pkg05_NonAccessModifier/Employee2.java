package pkg05_NonAccessModifier;

// 2
public class Employee2 {

    String  name;
    int     salary;

    // initializing final variable is must
    // final variable value can not be changed
    static final String empId = "Sales_288";

    public static void main(String[] args) {

        Employee2 emp = new Employee2();
        emp.name      = "Jon";
        emp.salary    = 20000;
        System.out.println(Employee2.empId);
        // attempting to change value of final variable
        // emp.empId     = "Sales_300";

        System.out.println(emp.getAppraisalCycleDuration());

    }

    public final int getAppraisalCycleDuration(){
        return 15; // months
    }

}
