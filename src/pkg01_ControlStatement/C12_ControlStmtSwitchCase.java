package pkg01_ControlStatement;

public class C12_ControlStmtSwitchCase {
    public static void main(String[] args) {

        String destinationCity = "Paris";
        String location = "Eiffel Tower";

        switch (destinationCity){
            case "London":
                System.out.println("Flight departure 13:00 hrs");
                break;
            case "Paris":
                System.out.println("Flight departure 15:00 hrs");
                break;
            case "New York":
                System.out.println("Flight departure 17:00 hrs");
                break;
            case "Oxford":
            case "Dallas":
            case "Barcelona":
                System.out.println("Flight schedule not available");
                break;
            default:
                System.out.println("No flights");
                break;
        }



















//        char letter = 'a';
//
//        switch (letter){
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println("Vowel");
//                break;
//            default :
//                System.out.println("Consonant");
//                break;
//        }

    }
}
