public class ThreadDemoTest {
    public static void main(String[] args) {
      String threadName =  Thread.currentThread().getName();
//        String ads = "ADS";
//        String threadName1 =  Thread.currentThread().setName(ads);
//        System.out.println(threadName1);
        System.out.println(Thread.currentThread().getThreadGroup().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(threadName);
        Thread numberCountThread = new NumberCountThread();
        numberCountThread.setName("Thread 1");
        numberCountThread.setPriority(1);
        numberCountThread.start();
        System.out.println(" Second thread       ");
        Thread numberCountThread2 = new NumberCountThread();
        numberCountThread2.setName("Thread 2");
        numberCountThread2.setPriority(6);
        numberCountThread2.start();
      Thread numberCountThread3 = new NumberCountThread();
      numberCountThread3.setName("Thread 3");
      numberCountThread3.setPriority(10);
      numberCountThread3.start();
    }
}
