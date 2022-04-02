package pkg21_Abstract;

public abstract class LoanProcessing {

    int creditScore[] = new int[5];
    boolean eligibility;

    public abstract void getFinancialInfo(String governmentId);

    public void processLoan(){
        eligibility = true;

        for (int n=0; n < creditScore.length; n++){
            if (creditScore[n] < 2000){
                eligibility = false;
                System.out.println("Not eligible for Loan as credit score is " + creditScore[n]);
                return;
            }
        }

        System.out.println("Eligible for Loan");
    }

    public void disburseAmount(){
        if(eligibility){
            System.out.println("Loan amount disbursed");
        }
    }

}
