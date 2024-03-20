public class NumberCountThread extends Thread{
    public  void  run(){
        System.out.println("from NumberCountTest");
        int i = 0;
        for (i = 0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"  "+ "Count : "+
                    i+"  "+"Thread Priority :"+Thread.currentThread().getPriority());
        }
    }
}
