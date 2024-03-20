package threadDemoPetrolStation;

public class PetrolStation {
    public synchronized  void petrol(String vehicleName, int noOfLtrs) {
        for (int i = 0; i <= noOfLtrs; i++) {
            System.out.println("Vehicel name : "+vehicleName+"   " + "Petrol Filed  : " + i);
        }
    }

    public synchronized void diesel(String vehicleName,int noOfLtrs) {
        for (int i = 0; i <= noOfLtrs; i++) {
            System.out.println("Vehicel name : "+vehicleName+"   " +"Diesel Filed  : " + i);

        }
    }
}
