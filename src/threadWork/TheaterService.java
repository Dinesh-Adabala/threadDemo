package threadWork;

public class TheaterService extends Thread {
    static int totalSeats = 3;
    public synchronized void run(){
        if (totalSeats>0){
        totalSeats--;
            System.out.println("Ticket Booked Successfully ");
        System.out.println("Number of Tickets Booked : "+totalSeats);
            System.out.println("Remaining seats : "+totalSeats);
        }else {
            System.out.println("Housefull ");
        }
    }
}
