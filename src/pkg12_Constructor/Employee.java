package pkg12_Constructor;

public class Employee {

    // default constructor


//    // no-arg, empty body constructor
//    Employee(){
//
//    }

    // no-arg, non-empty body constructor
    Employee(){
       System.out.println("Body");
    }

    // parameterized constructor
    Employee(String empId, int salary){
        System.out.println("Employee id is " + empId);
        System.out.println("Salary is      " + salary);
    }


    public static void main(String[] args) {
        System.out.println("Main method starts");
//        Employee e1 = new Employee();

        Employee e2 = new Employee("Sales002", 10000);

        System.out.println("Main method ends");
    }

}
