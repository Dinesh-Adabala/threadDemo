package trafficSignelsThread;

public class TrafficSignelTest {
    public static void main(String[] args) {
        SignelLights junction1 = new SignelLights("Junction 1");
        SignelLights junction2 = new SignelLights("Junction 2");
        SignelLights junction3 = new SignelLights("Junction 3");
        SignelLights junction4 = new SignelLights("Junction 4");

        Thread t1 = new Thread(junction1.toString());
        Thread t2 = new Thread(junction2.toString());
        Thread t3 = new Thread(junction3.toString());
        Thread t4 = new Thread(junction4.toString());

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Initially, turn on the green light for one junction
     //   junction1.switchGreen(); // For example, let's start with junction 1
    }
}



