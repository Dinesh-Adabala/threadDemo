package trafficSignelsThread;

public class Vehicles extends Thread{
    SignelLights signelLights;

    public void run() {
        while (true) {
            if (!signelLights.greenLight) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    signelLights.switchGreen();
                    e.printStackTrace();

                }
            }
            // Green light is on, simulate traffic flow
            System.out.println(signelLights.junctionName + " junction: Traffic flowing...");
            try {
                Thread.sleep(3000); // Simulate traffic flow for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            signelLights.switchRed(); // After 3 seconds, switch to red light
        }
    }
}