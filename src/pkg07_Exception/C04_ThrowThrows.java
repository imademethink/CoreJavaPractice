package pkg07_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_ThrowThrows {

    public static void main(String[] args) throws Exception {

        int divisor = getValue();

        if (divisor < 10) {
            throw new IllegalArgumentException("Divisor with value zero not allowed");
        }

        System.out.println(  9 / getValue()  );


        fileOperation();

    }

    public static int getValue(){
        return 0;
    }

    public static void fileOperation() throws Exception{
        File f = new File("random.txt");
        FileInputStream fis = new FileInputStream(f);
    }

}
