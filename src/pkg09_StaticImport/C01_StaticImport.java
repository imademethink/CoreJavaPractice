package pkg09_StaticImport;
import static pkg09_StaticImport.CitiBank.*;
import static java.lang.System.out;

public class C01_StaticImport {

    public static void main(String[] args) {
        //System.out.println(CitiBank.getInterestRate());
        out.println(getInterestRate());
    }

}
