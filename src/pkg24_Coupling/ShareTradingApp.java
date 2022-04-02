package pkg24_Coupling;

// Tightly coupled

class MobileSamsung {
    public void launchApp() {
        System.out.println("Samsung App launch");
    }
}

class MobileMicromax {
    public void launchApp() {
        System.out.println("Micromax App launch");
    }
}

class Manager {

    MobileSamsung samsung;
    MobileMicromax micromax;

    public Manager(MobileSamsung samsung, MobileMicromax micromax) {
        this.samsung  = samsung;
        this.micromax = micromax;
    }

    public void ManageAppLaunch() {
        samsung.launchApp();
        micromax.launchApp();
    }

}


public class ShareTradingApp {

    public static void main(String[] args) {

        MobileSamsung samsung   = new MobileSamsung();
        MobileMicromax micromax = new MobileMicromax();

        Manager mn = new Manager(samsung, micromax);
        mn.ManageAppLaunch();
    }

}
