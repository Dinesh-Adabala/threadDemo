public class RunnableThreadDemoTest {
    public static void main(String[] args) {
        Runnable numberCountRunbleThread = new NumberCountRunbleThread();
        Thread thread = new Thread(numberCountRunbleThread,"Runnable Thread");
        thread.start();
    }
}
