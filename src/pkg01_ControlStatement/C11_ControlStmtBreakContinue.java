package pkg01_ControlStatement;

public class C11_ControlStmtBreakContinue {

    public static void main(String[] args) {

        // break statement
        System.out.println("================");
        for (int index=0; index <= 5; index++)
        {
            System.out.println("before : " + index); // before : 0
            if(index > 0)
            {
                break;
            }
            System.out.println("after  : " + index);
        }

        System.out.println("================");











        // continue statement
        System.out.println("================");
        for (int index=0; index <= 5; index++)
        {
            System.out.println("before : " + index); // 0 1 2 3 4 5
            if(index > 3)
            {
                continue;
            };

            System.out.println("after  : " + index);  // 0 1 2 3
        }

        System.out.println("================");
    }
}
