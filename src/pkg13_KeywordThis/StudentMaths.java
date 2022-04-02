package pkg13_KeywordThis;

// constructor chaining using this keyword
// constructor overloading
public class StudentMaths {

    String studentId;
    String standard;
    String division;
    String address;
    String hobby;

    StudentMaths(){}

    StudentMaths(String studentId){
        this.studentId = studentId;
        System.out.println("Constructor 1 ends");
    }

    StudentMaths(String studentId, String standard, String division ){
        this(studentId);
        this.standard  = standard;
        this.division  = division;
        System.out.println("Constructor 2 ends");
    }

    StudentMaths(String studentId, String standard, String division, String address, String hobby){
        this(studentId, standard, division  );
        this.address   = address;
        this.hobby     = hobby;
        System.out.println("Constructor 3 ends");
    }


    public static void main(String[] args) {
        System.out.println("Main method start");

        StudentMaths s = new StudentMaths(
                "Maths001",
                 "5",
                  "A",
                  "MG Road",
                    "Painting");

        System.out.println("Main method end");

    }

}
