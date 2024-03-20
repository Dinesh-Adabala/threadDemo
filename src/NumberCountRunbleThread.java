public class NumberCountRunbleThread implements Runnable{
    @java.lang.Override
    public void run() {
        int i = 0;
        for (i = 0;i<=10;i++) {
            System.out.println(Thread.currentThread().getName() + "  " + "Count : "
                    + i + "  " + "Thread Priority :" + Thread.currentThread().getPriority());
        }
    }
}
