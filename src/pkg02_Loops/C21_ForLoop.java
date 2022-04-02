package pkg02_Loops;

public class C21_ForLoop {

    public static void main(String[] args) {

        // simple for loop
        System.out.println("================");
        //    -6 <= 5
        for (int index= 0; index <= 5; index--)
        {
            System.out.print(index + " ");

        }



















//        // Reverse print
//        System.out.println("\n===============");
//        for (int index=5; index >= 0; index--){
//            System.out.print(index + " ");
//        }









//        // Start index changed
//        System.out.println("\n===============");
//        for (int index=-5; index <= 5; ){
//            System.out.print(index + " ");
//
//            index++;  // 0
//            index++;  // 1
//        }
//        System.out.println();





        // enhanced for loop
        String [] examSubjects = {"English", "Maths", "History", "Science","Software", "Hardware"};

            // normal for loop
        for (int index=0; index < 5; index++){
            System.out.println(examSubjects[index]);
        }



        // enhanced for loop
        for (String oneSubject : examSubjects) {
            System.out.println(oneSubject);
        }


    }
}
