package pkg19_Encapsulation;

public class PayrollProcessing {

    private int salary=0;
    private String empId="";
    private int extraAllowance=0;

    public void setSalary(int salary, String user, String pwd){
        if( user.equals("admin")  && pwd.equals("admin123") )
            this.salary = salary;
        else
            this.salary = -1;
    }

    public int getSalary(){
        return salary;
    }

    public boolean processSalary(String empId,
                                 String designation,
                                 int basicSalary,
                                 int allowance){

        if( ! empId.contains("Sales_")) {
            System.out.println("\nInvalid empId " + empId);
            salary = 0;
            return false;
        }
        if( salary < 0) {
            System.out.println("\nInvalid salary set " + salary);
            salary = 0;
            return false;
        }

        this.empId = empId;

        switch (designation){
            case "Manager":
                extraAllowance = 2000;
                return calculateSalary(basicSalary, allowance);
                //break;
            case "SrAssociate":
                extraAllowance = 1000;
                return calculateSalary(basicSalary, allowance);
                //break;
            case "JrAssociate":
                extraAllowance = 0;
                return calculateSalary(basicSalary, allowance);
                //break;
            default:
                return false;
                //break;
        }
    }

    private boolean calculateSalary(int basicSalary, int allowance){
        salary = basicSalary + extraAllowance + ((allowance * basicSalary) / 100);
        //System.out.println(empId);
        //System.out.println(basicSalary);
        //System.out.println(allowance);
        //System.out.println(extraAllowance);
        //System.out.println(salary);
        return true;
    }

}
