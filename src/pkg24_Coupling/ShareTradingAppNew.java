package pkg24_Coupling;

// Loosly coupled

interface iLaunchApp{
    void launchApp();
}

class MobileSamsung2 implements iLaunchApp{
    @Override
    public void launchApp() {
        System.out.println("Samsung App launch");
    }
}

class MobileMicromax2 implements iLaunchApp{
    @Override
    public void launchApp() {
        System.out.println("Micromax App launch");
    }
}

class MobileOnPlus2 implements iLaunchApp{
    @Override
    public void launchApp() {
        System.out.println("Oneplus App launch");
    }
}

class ManagerNew {

    iLaunchApp launchapp;

    public ManagerNew(iLaunchApp launchapp) {
        this.launchapp  = launchapp;
    }

    public void ManageAppLaunch() {
        this.launchapp.launchApp();
    }

}


public class ShareTradingAppNew {

    public static void main(String[] args) {

        MobileSamsung2 samsung   = new MobileSamsung2();
        ManagerNew mn21 = new ManagerNew(samsung);
        mn21.ManageAppLaunch();

        MobileMicromax2 micromax = new MobileMicromax2();
        ManagerNew mn22 = new ManagerNew(micromax);
        mn22.ManageAppLaunch();

        MobileOnPlus2 onePlus    = new MobileOnPlus2();
        ManagerNew mn23 = new ManagerNew(onePlus);
        mn23.ManageAppLaunch();

    }
}
