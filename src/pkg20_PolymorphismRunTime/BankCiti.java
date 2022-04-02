package pkg20_PolymorphismRunTime;

public class BankCiti extends Bank{

    @Override
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
                    this.balanceAmount = this.balanceAmount + amount;
                    return false;
                }
                System.out.println("After debit Current balance " + this.balanceAmount);
                return true;
                //break;
            case "credit":
                if(amount > 100000){
                    System.out.println("   Target this user for Promo Offer");
                }
                this.balanceAmount = this.balanceAmount + amount;
                System.out.println("After credit Current balance " + this.balanceAmount);
                return true;
                //break;
            default:
                System.out.println("This operation not supported " + opsType);
                return false;
        }
    }

    public static void main(String[] args) {

        BankCiti citi = new BankCiti();

        citi.processTransaction(90000, "credit");
        citi.processTransaction(1000000, "credit");
        citi.processTransaction(300000, "debit");
        citi.processTransaction(-400, "debit");

    }


}
