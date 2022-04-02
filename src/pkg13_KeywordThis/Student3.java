package pkg13_KeywordThis;


class School{

    public void attendLecture(){
        System.out.println("Attend Lecture School");
    }

}

// this keyword in inheritance
public class Student3 extends School{

    public void attendLecture(){
        System.out.println("Attend Lecture");
    }

    public void begin(){
        this.attendLecture();
    }

    public static void main(String[] args) {
        System.out.println("Main method start");

        Student3 s = new Student3();

        s.begin();

        System.out.println("Main method end");

    }

}
