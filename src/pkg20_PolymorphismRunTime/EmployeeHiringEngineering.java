package pkg20_PolymorphismRunTime;

public class EmployeeHiringEngineering implements EmployeeHiring{

    @Override
    public void provideSkills(String skills){
        System.out.println("Engineering skills required :" + skills);
        System.out.println("Experience in product based company");
    }

    @Override
    public void hireEmployee(int noOfVacancy){
        System.out.println("Engineering vacancy :" + noOfVacancy);
        System.out.println("Vacancy open for min 5 yrs experience");
    }

    public static void main(String[] args) {

        EmployeeHiringEngineering engineering = new EmployeeHiringEngineering();
        engineering.provideSkills("Product-design Programming UI Design");

        engineering.hireEmployee(6);
    }
}
