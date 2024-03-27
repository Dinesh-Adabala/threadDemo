package synchronizedBlockDemo;

import threadDemoPetrolStation.PetrolStation;
import threadDemoPetrolStation.Vechicle;

public class SynchronizedTest {
    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation();
        Thread bike = new Vechicle(3,"Empty","petrol",petrolStation);
        bike.setName("R15");
        Thread bike1 = new Vechicle(5,"Empty","petrol",petrolStation);
        bike1.setName("FZ");
        Thread bike2 = new Vechicle(5,"Empty","petrol",petrolStation);
        bike2.setName("Hero Honda");


        Thread car1 = new Vechicle(5,"Empty","diese",petrolStation);
        car1.setName("AUDI");
        Thread car2 = new Vechicle(5,"Empty","diese",petrolStation);
        car2.setName("SHFIT");

        bike.start();
        bike1.start();
        bike2.start();
        car1.start();
        car2.start();
    }
}
