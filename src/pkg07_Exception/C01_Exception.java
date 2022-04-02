package pkg07_Exception;

import java.io.File;
import java.io.FileInputStream;

public class C01_Exception {
    public static void main(String[] args)
    {
        System.out.println();
//        Arithmatic Exception
//        System.out.println(  9 / getValue()  );

//        Array Index Out Of Bounds Exception
//        int ary[] = {   3,6,8,0,8     };
//        System.out.println( ary[ getIndex() ] );

//        FileNotFoundException
//        File f = new File("G:\\random.txt");
//        FileInputStream fis = new FileInputStream(f);

    }

    public static int getValue(){
        return 0;
    }
    public static int getIndex(){
        return 25;
    }
}
