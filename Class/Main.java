//-----------------------------------------------------Lecture Number - 08-------------------------------------------------------

//----------------------------------------------------------CLASS----------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
        // Creating Vehicle objects using constructor
        Vehicle car = new Vehicle("Toyota", "Corolla", 2022, "Red");
        System.out.println(car.toString());
        car.start();
        car.accelerate();
        car.brake();
        car.stop();

        System.out.println("**********************");

        Vehicle motorcycle = new Vehicle("Yamaha", "YZF-R3", 2021, "Blue");
        System.out.println(motorcycle.toString());
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.brake();
        motorcycle.stop();
    }
}
