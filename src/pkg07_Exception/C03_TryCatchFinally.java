package pkg07_Exception;

public class C03_TryCatchFinally {
    public static void main(String[] args) {

//        // try-catch-finally - no exception anywhere
//        try{
//            System.out.println("Inside Try block before.");
//            System.out.println("Inside Try block after.");
//        }catch(Exception e){
////            System.out.println(  9 / 0  );
//            System.out.println("Inside catch block.");
//        }finally {
//            System.out.println("Inside finally block.");
//        }




//        // try-catch-finally
//        try{
//            System.out.println("Inside Try block before");
//            int ary[] = {3,6,8,0,8};
//            System.out.println( ary[ 25] );
//            System.out.println("Inside Try block after");
//        }catch(Exception e){
//            System.out.println("Inside catch block");
//        } finally {
//            System.out.println("Inside finally block");
//        }



        // try-catch (exact exception not handled)-finally
        try{
            System.out.println("Inside Try block before");
            int ary[] = {3,6,8,0,8};
            System.out.println( ary[ 25 ] );
            System.out.println("Inside Try block after");
        }catch(ArithmeticException e){
            System.out.println("Inside catch block");
        }finally {
            System.out.println("Inside finally block");
        }


//
//
//
//
//
//
//
//
//        // exception inside catch block
//        try{
//            System.out.println("Inside Try block before...");
//            int ary[] = {3,6,8,0,8};
//            System.out.println( ary[ getIndex() ] );
//            System.out.println("Inside Try block after...");
//        }catch(Exception e){
//            System.out.println("Inside catch block...");
//            int ary[] = {3,6,8,0,8};
//            System.out.println( ary[ getIndex() ] );
//            System.out.println("Inside catch block...after");
//        }finally {
//            System.out.println("Inside finally block...");
//        }
//
//
//
//
//
//
//
//
//
//
//        // try-finally (no catch block)
//        try{
//            System.out.println("Inside Try block...");
//        }finally {
//            System.out.println("Inside finally block...");
//        }
//
//        // try-finally (no catch block)
//        try{
//            System.out.println("Inside Try block before");
//            int ary[] = {3,6,8,0,8};
//            System.out.println( ary[ getIndex() ] );
//            System.out.println("Inside Try block after");
//        }finally {
//            System.out.println("Inside finally block");
//        }

//        System.out.println("end");

    }



    public static int getValue(){
        return 0;
    }
    public static int getIndex(){
        return 25;
    }

}
