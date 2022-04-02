package pkg20_PolymorphismCompileTime;

public class BankAccount {

    // overloaded method
    public void openAccount(){

        System.out.println("Opening Saving Account");

    }

    // overloaded method
    public boolean openAccount(int loanAmount){

        System.out.println("Opening Loan Account with loan amount " + loanAmount);
        return true;

    }

    // overloaded method
    public void openAccount(String govtId){

        System.out.println("Opening Share Trading Account with govern id " + govtId);

    }

    public static void main(String[] args) {

        BankAccount ba = new BankAccount();

        ba.openAccount();

        ba.openAccount(20000);

        ba.openAccount("Driving Licence Paris20000101");
    }
}
