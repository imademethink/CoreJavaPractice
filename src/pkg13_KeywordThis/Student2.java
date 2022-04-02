package pkg13_KeywordThis;

// this keyword inside constructor
public class Student2 {

    String studentId;
    String standard;
    String division;
    String address;
    String hobby;


    Student2(String studentId, String standard, String division, String address, String hobby){
        this.studentId = studentId;
        this.standard  = standard;
        this.division  = division;
        this.address   = address;
        this.hobby     = hobby;
    }


    public static void main(String[] args) {
        System.out.println("Main method start");

        Student2 s = new Student2(
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
