package pkg11_InheritanceType;

public class ProcessInsurance extends Employee{

    public void calculateInsurancePremium(String empId){
        System.out.println("Insurance premium processing for employee id " + empId);
    }

    public static void main(String[] args) {

        ProcessInsurance insurance = new ProcessInsurance();

        String empId               = insurance.getEmployeeId();

        insurance.calculateInsurancePremium(empId);

    }

}
