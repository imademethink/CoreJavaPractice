package pkg00_DataTypes;

public class C01_Primitive {

    public static void main(String[] args) {

        byte b  = -127;    // 8 bit
        System.out.println("byte value:    " + b);

        short s = 32767;    // 16 bit
        System.out.println("short value:   " + s);

        int i   = -2147483647;    // 32 bit
        System.out.println("int value:     " + i);

        long l  = 922337203;     // 64 bit
        System.out.println("long value:    " + l);

        float f = -3.14f;                             // remember to end the value with 'f'
        System.out.println("float value:   " + f);

        double d= -999999.9999;
        System.out.println("double value:  " + d);

        char c = '@';
        System.out.println("char value:    " + c);

        char c2 = 65;   // A                                  // ASCII value
        System.out.println("char value:    " + c2);

        boolean bool = true;
        System.out.println("boolean value: " + bool);


    }

}
