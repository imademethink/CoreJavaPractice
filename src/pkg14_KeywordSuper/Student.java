package pkg14_KeywordSuper;

public class Student extends School {

    public String name = "XYZ school";

    Student()
    {
        // calling parent class constructor
        // super() should be the first statement
        super();
        System.out.println("Inside constructor Student");
    }

    public void attendLecture(){
        System.out.println("Attend Lecture Student");
    }

    public void begin()
    {
        this.attendLecture();   // calling current class method
        int k = 9;
        super.attendLecture();  // calling parent class method (it may not be the first statement)
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        System.out.println("Main method start");

        Student s = new Student();

        s.begin();

        System.out.println("Main method end");

    }

}
