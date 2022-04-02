package pkg20_PolymorphismCompileTime;

public class VehicleDriving {

    // overloaded method
    public void driveVehicle(){
        System.out.println("Driving hands free");
    }

    // overloaded method
    public int driveVehicle(int noOfWheels) throws Exception{
        System.out.println("Driving Motorcycle with helmet");
        return 3;
    }

    // overloaded method
    public int driveVehicle(int noOfWheels, String drivingMode){
        System.out.println("Driving Vehicle in Sports mode");
        return 80;
    }

    // overloaded method
    public int driveVehicle(String drivingMode, int noOfWheels){
        System.out.println("Driving Vehicle in Hand free mode");
        return 60;
    }

    public static void main(String[] args) throws Exception {

        VehicleDriving c = new VehicleDriving();

        c.driveVehicle();

        c.driveVehicle(2);

        c.driveVehicle(4, "Sports");

        c.driveVehicle("Kids", 4 );
    }




}
