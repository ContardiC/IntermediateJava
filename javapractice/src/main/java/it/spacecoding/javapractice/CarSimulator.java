package it.spacecoding.javapractice;

public class CarSimulator {
    public static void main(String[] args) {
        System.out.println("Launching car simulator ...");

        Car myToyota = new Car("Blue", "Wood");
        Car myHonda = new Car();
        SelfDrivingCar autoBot = new SelfDrivingCar("Yellow", "Plastic");
        System.out.println(autoBot.mColour);
        System.out.println(autoBot.getNumberOfSeats());
        System.out.println(autoBot.mInterior);
        myHonda.drive();
        autoBot.drive();
    }
}
