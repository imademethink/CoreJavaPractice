package pkg03_TypeCasting;

public class C91_TypeCasting {
    public static void main(String[] args) {

        // converting int to byte
        int i  = 256;
        byte b = (byte) i;
        System.out.println(i);
        System.out.println(b);

        // converting float to byte
        float f   = 333.88f;
        byte b2   = (byte) f;
        System.out.println(f);
        System.out.println(b2);

        // converting double to float
        double d  = 1999999999;
        float f2  = (float) d;
        System.out.println(d);
        System.out.println(f2);

    }
}
