package pkg20_PolymorphismRunTime;

public class Bank {

    public int balanceAmount;

    public boolean processTransaction(int amount, String opsType){

        if (amount <= 0){
            System.out.println("Processing 0 or negative amount not supported");
            return false;
        }

        switch (opsType){
            case "debit":
                this.balanceAmount = this.balanceAmount - amount;
                if ( this.balanceAmount < 0 ){
                    System.out.println("Balance is going negative so this failed");
                    return false;
                }
            case "credit":
                this.balanceAmount = this.balanceAmount + amount;
                return true;
            default:
                System.out.println("This operation not supported " + opsType);
                return false;
        }
    }
}
