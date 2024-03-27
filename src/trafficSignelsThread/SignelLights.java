package trafficSignelsThread;

public class SignelLights {

     String junctionName;
     boolean greenLight = false;

    public SignelLights(String name) {
        this.junctionName = name;
    }

    public synchronized void switchGreen() {
        greenLight = true;
        System.out.println(junctionName + " junction: Green light ON");
        notifyAll();
    }

    public synchronized void switchRed() {
        greenLight = false;
        System.out.println(junctionName + " junction: Red light ON");
    }
}