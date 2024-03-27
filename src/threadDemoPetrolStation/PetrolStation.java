package threadDemoPetrolStation;

public class PetrolStation {
    Object petrol = new Object();
    Object diesel = new Object();

//    public synchronized  void petrol(String vehicleName, int noOfLtrs) {
//        for (int i = 0; i <= noOfLtrs; i++) {
//            System.out.println("Vehicel name : "+vehicleName+"   " + "Petrol Filed  : " + i);
//        }
//    }
//
//    public synchronized void diesel(String vehicleName,int noOfLtrs) {
//        for (int i = 0; i <= noOfLtrs; i++) {
//            System.out.println("Vehicel name : "+vehicleName+"   " +"Diesel Filed  : " + i);
//
//        }
//    }

    public   void synchronizedPetrol(String vehicleName, int noOfLtrs) {
        synchronized (petrol) {
            for (int i = 0; i <= noOfLtrs; i++) {
                System.out.println("Vehicel name : " + vehicleName + "   " + "Petrol Filed  : " + i);
            }
        }
    }

    public void synchronizedDiesel(String vehicleName,int noOfLtrs) {
        synchronized (diesel) {
            for (int i = 0; i <= noOfLtrs; i++) {
                System.out.println("Vehicel name : " + vehicleName + "   " + "Diesel Filed  : " + i);

            }
        }
    }



}
