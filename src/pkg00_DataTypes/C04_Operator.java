package pkg00_DataTypes;

public class C04_Operator {
    public static void main(String[] args) {




        // Unary operator : postfix  ++ --
        int a = -5;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);








        // Unary operator : prefix ++ --
        int c = 9;
        System.out.println(c);
        ++c;
        System.out.println(c);
        --c;
        System.out.println(c);



        int d = 57;
        System.out.println(d--);
        d = 10;
        System.out.println(d++);






        // Modulus operator
        int e = 19 % 4;
        System.out.println(e);


        int f = 9 % -4;
        System.out.println(f);


























        // Assignment operator
        int g = 23;
        g     = g + 1;
        System.out.println(g);
        int h = 6;
        h    +=3;
        System.out.println(h); // 9
        h    -=10;
        System.out.println(h);
        h    *=2;
        System.out.println(h);


















        // Boolean operator
        int   j = 8, k = 0; // decimal
        // binary         8 = 1000       k = 0000
        System.out.println(j & k);  // Binary AND
        System.out.println(j | k);  // Binary OR






















        // Conditional operator  &&  ||
        boolean seatOccupied = false;
        int      price        = 200;
        if (     (seatOccupied==false)    ||       (price < 100)    )
        {
            System.out.println("Please book the seat");
        }


//        System.out.println("=================================");
//        int kk = 55;
//        int pp = -5;
//        int ww = 0;
//        System.out.println( -5 + pp + --pp + ww++ + 22);   // ===> 6
//        int xx = kk +8 -ww + --ww + 88 + 0 + --pp + pp + pp++;
//        System.out.println(xx);     // ==> 129
//        System.out.println("=================================");

    }
}
