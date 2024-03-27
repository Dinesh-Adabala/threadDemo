package trafficSignelsThread;

import java.util.concurrent.TimeUnit;

class SignalLight implements Runnable {
    Object light = new Object();
    Object light1 = new Object();
    private String junctionName;
    private boolean greenLight = false;

    public  SignalLight(String name) {
        this.junctionName = name;
    }

    public synchronized void switchGreen() {
            greenLight = true;
            System.out.println(junctionName + " junction: Green light ON");
            notify();
        }


    public synchronized  void switchRed() {

            greenLight = false;
            System.out.println(junctionName + " junction: Red light ON");
        }


    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                while (!greenLight) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            System.out.println(junctionName + " junction: Traffic flowing...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            try {
//                TimeUnit.SECONDS.sleep(3);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            switchRed();
        }
    }



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


        junction1.switchGreen();
        junction2.switchGreen();
        junction3.switchGreen();
        junction4.switchGreen();

    }
}



