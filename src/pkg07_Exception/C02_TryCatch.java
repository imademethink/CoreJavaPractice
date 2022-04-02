package pkg07_Exception;

public class C02_TryCatch {
    public static void main(String[] args) {

        // simple try-catch
        try
        {
            System.out.println("Inside Try block before");

            System.out.println(  9 / getValue()  );

            System.out.println("Inside Try block after");

        }catch(Exception e)
        {
            System.out.println("Inside Catch block");
        }



//        // multiple catch blocks
//        try{
//            System.out.println("Inside Try block before");
//            System.out.println(  9 / getValue()  );
//            int ary[] = {3,6,8,0,8};
//            System.out.println( ary[ getIndex() ] );
//            System.out.println("Inside Try block after");
//        }catch(ArithmeticException e){
//            System.out.println("ArithmeticException123");
//
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException123");
//
//        }catch(Exception e){
//            System.out.println("Generic Exception123");
//        }
//        System.out.println(" now here ");


//        // order of multiple catch blocks
//        try{
//            System.out.println("Inside Try block before");
//            int ary[] = {3,6,8,0,8};
//            System.out.println( ary[ getIndex() ] );
//            System.out.println("Inside Try block after");
//        }
//        catch(Exception e){
//            System.out.println("Generic Exception");
//        }
//        catch(ArithmeticException e){
//            System.out.println("ArithmeticException");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException");
//        }

//
//

//        // multiple Exceptions in same catch blocks
//        try{
//            System.out.println("Inside Try block before");
//            int ary[] = {3,6,8,0,8};
//            System.out.println( ary[ getIndex() ] );
//            System.out.println("Inside Try block after");
//
//        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
//            System.out.println("ArithmeticException or ArrayIndexOutOfBoundsException");
//        }





    }


    public static int getValue(){
        return 2;
    }
    public static int getIndex(){
        return 3;
    }
}
