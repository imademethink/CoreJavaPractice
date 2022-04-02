package pkg13_KeywordThis;

public class Student1 {

    String studentId;
    String standard;
    String division;
    String address;
    String hobby;


    // not useful approach having duplicate variable names
    Student1(String studentId, String standard, String division, String address, String hobby){
        studentId = studentId;
        standard  = standard;
        division  = division;
        address   = address;
        hobby     = hobby;
    }


    public static void main(String[] args) {
        System.out.println("Main method start");

        Student1 s = new Student1(
                "Maths001",
                "5",
                "A",
                "MG Road",
                "Painting");

        System.out.println(s.studentId);
        System.out.println(s.standard);
        System.out.println("Main method end");

    }

}
