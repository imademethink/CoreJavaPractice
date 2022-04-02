package pkg19_Encapsulation;

public class Parent {

    private int keyOfVehicle = 10;

    public int getKey(String user, String pass){
        if (user.equals("admin") && pass.equals("root123")){
            return keyOfVehicle;
        }else
            return -1;
    }

    public void setKey(int keyOfVehicleNew,String user, String pass){
        if (user.equals("admin") && pass.equals("root123")){
            keyOfVehicle = keyOfVehicleNew;
        }else
            System.out.println("Invalid credentials");
    }
}


















