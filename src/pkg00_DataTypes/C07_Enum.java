package pkg00_DataTypes;

public class C07_Enum {

    public enum Result{
        DISTINSION, FISTCLASS, SECONDCLASS, PASS, FAIL
    }

    public static void main(String[] args) {

        Result r        = Result.PASS;
        System.out.println(r);
        System.out.println(Result.PASS);
        System.out.println(Result.PASS.toString());

        String myResult = "FISTCLASS";
        System.out.println(Result.valueOf(myResult));


        // inside if statement
        if(r == Result.FAIL){
            System.out.println("FAIL");
        }else{
            System.out.println("Not fail");
        }


        // inside switch case
        switch (r){
            case FAIL:
                System.out.println("FAIL");
                break;
            case PASS:
            case SECONDCLASS:
            case FISTCLASS:
            case DISTINSION:
                System.out.println("Not fail");
                break;
        }

    }

}
