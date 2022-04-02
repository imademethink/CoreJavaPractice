package pkg22_Interface;

public class MobileIOS implements Mobile {

    @Override
    public void deviceTurnOnMechanism(){
        System.out.println("iOS Mobile Turn On - Long press power and volume button");
    }

    @Override
    public void deviceTurnOffMechanism(){
        System.out.println("iOS Mobile Turn Off - Long press power and volume button");
    }

    @Override
    public void deviceNavigationBackKey(){
        System.out.println("iOS Mobile Turn On - Back key on screen option");
    }

    @Override
    public void deviceVibrationMechanism(){
        System.out.println("iOS Mobile Turn On - Vibrate once");
    }

    public static void main(String[] args) {

        // variable of Child class = new Object of Child class
        MobileIOS iPhone = new MobileIOS();
        iPhone.deviceTurnOnMechanism();
        iPhone.deviceNavigationBackKey();
        iPhone.deviceVibrationMechanism();
        iPhone.deviceTurnOffMechanism();

        // variable of parent Interface = new Object of Child class
        Mobile iPhoneOrg = new MobileIOS();
        iPhoneOrg.deviceTurnOnMechanism();
        iPhoneOrg.deviceNavigationBackKey();
        iPhoneOrg.deviceVibrationMechanism();
        iPhoneOrg.deviceTurnOffMechanism();

    }

}
