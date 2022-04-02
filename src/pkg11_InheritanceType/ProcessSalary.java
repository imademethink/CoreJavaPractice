package pkg11_InheritanceType;

public class ProcessSalary extends Employee {

    public void calculateSalary(String empId){
        System.out.println("Salary processing for employee id " + empId);
    }

    public static void main(String[] args) {

        ProcessSalary salary = new ProcessSalary();

        String empId         = salary.getEmployeeId();

        salary.calculateSalary(empId);

    }
}
