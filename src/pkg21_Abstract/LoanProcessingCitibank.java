package pkg21_Abstract;

public class LoanProcessingCitibank extends LoanProcessing{

    @Override
    public void getFinancialInfo(String governmentId){
        System.out.println("Required credit score for " + governmentId);
        creditScore[0] = 2100;
        creditScore[1] = 6400;
        creditScore[2] = 3200;
        creditScore[3] = 6900;
        creditScore[4] = 9900;
    }

    public void confirmMessage(){
        System.out.println("Congrats!!");
    }

    public static void main(String[] args) {

        //variable of Abstract class = new Object of Derived Abstract class - not possible
        //LoanProcessing loanprocess = new LoanProcessing();

        //variable of Child class   = new Object of Child class
        LoanProcessingCitibank loan = new LoanProcessingCitibank();

        loan.getFinancialInfo("Abcd1234");

        loan.processLoan();

        loan.disburseAmount();
        //loan.confirmMessage();


        //variable of Abstract class  = new Object of Child class
        LoanProcessing loanprocessOrg = new LoanProcessingCitibank();

        loanprocessOrg.getFinancialInfo("Abcd1234");

        loanprocessOrg.processLoan();

        loanprocessOrg.disburseAmount();
        //loanprocessOrg.confirmMessage();


    }

}
