package pkg22_Interface;

public class MobileAndroid implements Mobile {

    @Override
    public void deviceTurnOnMechanism(){
        System.out.println("Android Mobile Turn On - Long press power button");
    }

    @Override
    public void deviceTurnOffMechanism(){
        System.out.println("Android Mobile Turn Off - Long press power button");
    }

    @Override
    public void deviceNavigationBackKey(){
        System.out.println("Android Mobile Turn On - Back key at bottom");
    }

    @Override
    public void deviceVibrationMechanism(){
        System.out.println("Android Mobile Turn On - Vibrate twice");
    }

//    public void deviceAutoReboot(){System.out.println("Android Mobile Auto Reboot");}


    public static void main(String[] args) {
        // variable of Child class = new Object of Child class
        MobileAndroid android = new MobileAndroid();
        android.deviceTurnOnMechanism();
        android.deviceNavigationBackKey();
        android.deviceVibrationMechanism();
        android.deviceTurnOffMechanism();
//        android.deviceAutoReboot();


        // variable of parent Interface = new Object of Child class
        Mobile androidOrg = new MobileAndroid();
        androidOrg.deviceTurnOnMechanism();
        androidOrg.deviceNavigationBackKey();
        androidOrg.deviceVibrationMechanism();
        androidOrg.deviceTurnOffMechanism();
//        androidOrg.deviceAutoReboot();

    }

}
