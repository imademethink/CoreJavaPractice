package pkg20_PolymorphismRunTime;

public class EmployeeHiringMarketing implements EmployeeHiring{

    @Override
    public void provideSkills(String skills){
        System.out.println("Marketing skills required :" + skills);
    }

    @Override
    public void hireEmployee(int noOfVacancy){
        System.out.println("Marketing vacancy :" + noOfVacancy);
    }

    public static void main(String[] args) {

        EmployeeHiringMarketing marketing = new EmployeeHiringMarketing();
        marketing.provideSkills("Telemarketing Outbound-calling Multi-Language-Communication");

        marketing.hireEmployee(3);
    }
}
