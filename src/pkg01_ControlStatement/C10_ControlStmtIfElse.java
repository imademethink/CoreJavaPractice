package pkg01_ControlStatement;

public class C10_ControlStmtIfElse {

    public static void main(String[] args) {

        // Simple if, if..else
        boolean seatOccupied = false;
        int      price        = 400;
        if ( seatOccupied==false &&  price < 300)
        {
            System.out.println("Please book the seat");
        }
        else
        {
            System.out.println("No booking");
        }




















        // if.. else if
        int marks = 85;

        if (marks > 80){
            System.out.println("Distinction class");
        }else if (marks > 60){
            System.out.println("First class");
        }else if (marks > 50){
            System.out.println("Second class");
        }else if (marks > 35){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }




















        // nested if..else
        int income = 50350;

        if (income > 40000)
        {
            System.out.println("Income is taxable");
            if (income > 50000){
                System.out.println("  40 % income tax");
            }else{
                System.out.println("  20 % income tax");
            }
        }else{
            System.out.println("No tax");
        }

    }

}
