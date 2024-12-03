package it.spacecoding.javapractice;

public class SelfDrivingCar extends Car{
    public SelfDrivingCar(String chosenColour, String chosenInterior) {
        super(chosenColour, chosenInterior);
    }
    @Override
    public void drive() {
        System.out.println("Driving to Googleplex, Mountain View");
    }

}
