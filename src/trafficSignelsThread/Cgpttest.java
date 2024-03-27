package trafficSignelsThread;

public class Cgpttest {

        public static void main(String[] args) {
            SignalLight junction1 = new SignalLight("Junction 1");
            SignalLight junction2 = new SignalLight("Junction 2");
            SignalLight junction3 = new SignalLight("Junction 3");
            SignalLight junction4 = new SignalLight("Junction 4");

            Thread t1 = new Thread(junction1);
            Thread t2 = new Thread(junction2);
            Thread t3 = new Thread(junction3);
            Thread t4 = new Thread(junction4);

            t1.start();
            t2.start();
            t3.start();
            t4.start();

            // Initially, turn on the green light for one junction
           // junction1.switchGreen(); // For example, let's start with junction 1
        }
    }

