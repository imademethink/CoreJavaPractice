package pkg04_Class;
// 3
public class Bank
{
    int balance = 200;

    public static void main(String[] args)
    {
        int k = -9;

        // Variable of Bank class = new Object of Bank class
        Bank citi = new Bank();
        System.out.println("First balance  =" + citi.balance);

        citi.AddMoney();

        citi.DeductMoney();

        int latestBalance = citi.GetBalance();

        System.out.println("Latest balance  =" + latestBalance);
    }


    public void AddMoney(){
        System.out.println("Adding Money");
        balance = balance + 25;
    }

    public void DeductMoney(){
        System.out.println("Deducting Money");
        balance = balance - 100;
    }

    public int GetBalance(){
        System.out.println("Current Balance =" + balance);
        return balance;
    }

}
