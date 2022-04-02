package pkg11_InheritanceType;

public class ProcessAttendance extends Employee{

    public void processAttendance(String empId){
        System.out.println("Attendance processing for employee id " + empId);
    }

    public static void main(String[] args) {

        ProcessAttendance attendance = new ProcessAttendance();

        String empId                 = attendance.getEmployeeId();

        attendance.processAttendance(empId);

    }

}
