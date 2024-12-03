package it.spacecoding.javapractice;

public class Car {
    // attibuti
    public String mColour = "Black";
    private int mNumberOfSeats = 4;
    protected String mInterior;
    public int getNumberOfSeats() {
        return mNumberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        mNumberOfSeats = numberOfSeats;
    }

    // costruttore vuoto
    public Car(){
        mInterior = "Leather"; // inizializzazione dell'attributo mInterior di default
    }
    // costruttore con parametri
    public Car(String chosenColour, String chosenInterior){
        mColour = chosenColour;
        mInterior = chosenInterior;
    }

    public String getInterior() {
        return mInterior;
    }

    public void setInterior(String interior) {
        mInterior = interior;
    }

    public String getColour() {
        return mColour;
    }

    public void setColour(String colour) {
        mColour = colour;
    }

    //metodi
    public void drive(){
        System.out.println("Car is moving");
    }

}
