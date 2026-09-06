package com.example.sfn402_lab1;
/**
 * Represents a passenger ship that transports passengers and
 * provides passenger entertainment services.
 */
public class PassengerShip extends Ship implements PassengerServices{
    private int passCap;
    private int passCount;
    private int numCabins;
    private boolean entertain;

    /**
     * Constructs a passenger ship with its ship information,
     * passenger details, cabins, and entertainment status.
     *
     * @param n              the name of the ship
     * @param rn             the ship's registration number
     * @param tn             the ship's tonnage
     * @param crewS          the number of crew members
     * @param cp             the ship's current port
     * @param currS          the ship's current speed
     * @param passengerCap   the maximum passenger capacity
     * @param passengerCount the current number of passengers
     * @param cabins         the number of passenger cabins
     * @param entertainment  whether entertainment facilities are available
     */
    public PassengerShip(String n, String rn, double tn, int crewS,
                          String cp, double currS,
                         int passengerCap, int passengerCount,
                         int cabins, boolean entertainment) {

        super(n, rn, tn, crewS, cp, currS);

        setPCap(passengerCap);
        setPcount(passengerCount);
        setNCab(cabins);
        setEntertain(entertainment);
    }

//getters and setters;
    public void setPCap(int num) {
        if (num <= 0 || num < passCount) {
            throw new IllegalArgumentException(
                    "Passenger capacity must be positive and cannot be below the current passenger count.");
    }

    passCap = num;
}

    public int getPCap(){
        return passCap;
    }



    public void setPcount(int count) {
        if (count < 0 || count > passCap) {
            throw new IllegalArgumentException(
                    "Passenger count must be between 0 and the capacity.");
        }

        passCount = count;
    }

    public int getPcount(){
        return passCount;
    }


    public void setNCab(int nCab) {
        if (nCab < 0) {
            throw new IllegalArgumentException(
                    "Number of cabins cannot be negative.");
        }

        numCabins = nCab;
    }

    public int getCab(){
        return numCabins;
    }


    public void setEntertain(boolean typeE){
        entertain = typeE;
    }

    public boolean getEntertainment(){
        return entertain;
    }

    @Override
    public void startEntertainment() {
        if (entertain) {
            System.out.println(getName()
                    + " is starting entertainment services.");
        } else {
            System.out.println(getName()
                    + " does not have entertainment services.");
        }
    }

    /**
     * Creates and returns a formatted passenger manifest containing
     * the ship's name, passenger capacity, and number of cabins.
     *
     * @return a formatted String containing the passenger manifest
     */
    @Override
    public String getPassengerManifest() {
        return "Passenger Ship Manifest:"
                + "\nName: " + getName()
                + "\nPassenger Capacity: " + passCap
                + "\nCabins: " + numCabins;
    }


    /**
     * Docks the passenger ship at a specified port and disembarks
     * all passengers.
     *
     * @param portN the name of the port where the ship will dock
     * @throws IllegalArgumentException if the port name is invalid
     */
    @Override
    public void dock(String portN){
        super.dock(portN);
        disembarkPassengers();
    }

    /**
     * Disembarks all passengers and sets the passenger count to zero.
     */
    private void disembarkPassengers() {
        System.out.println(passCount
                + " passengers are disembarking.");

        setPcount(0);
    }

    @Override
    public String toString() {
        return "Passenger Ship [name: " + getName()
                + ", registrationNumber: " + getRegi()
                + ", tonnage: " + getTon()
                + ", crewSize: " + getcsize()
                + ", currentSpeed: " + getSpeed()
                + ", currentPort: " + getPort()
                + ", passengerCapacity: " + passCap
                + ", passengerCount: " + passCount
                + ", numberOfCabins: " + numCabins
                + ", hasEntertainmentFacilities: " + entertain
                + "]";
    }




}
