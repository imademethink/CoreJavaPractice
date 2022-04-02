package pkg19_Encapsulation;

public class DepartmentSales {

    public static void main(String[] args) throws Exception{

        PayrollProcessing salesEmp = new PayrollProcessing();

        salesEmp.setSalary(0,"admin", "admin123");
        salesEmp.processSalary("Sales_002",
                          "Manager",
                          8000,
                           10);
        System.out.println("\nSalary processed for Sales_002 : " + salesEmp.getSalary());

        salesEmp.setSalary(0,"user", "user123");
        salesEmp.processSalary("Sales_018",
                "SrAssociate",
                5000,
                5);
        System.out.println("\nSalary processed for Sales_018 : " + salesEmp.getSalary());

        salesEmp.setSalary(0,"admin", "admin123");
        salesEmp.processSalary("Marketing_020",
                "SrAssociate",
                5000,
                5);
        System.out.println("\nSalary processed for Marketing_020 : " + salesEmp.getSalary());

    }

}
