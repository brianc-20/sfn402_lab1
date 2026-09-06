package com.example.sfn402_lab1;
/**
 * Represents a ship that transports and deploys emergency aid.
 * An aid ship contains a specific type and quantity of supplies
 * and may have a helipad.
 */
public class AidShip extends Ship implements EmergencySupport {

    private String aidType;
    private int suppliesOnBoard;
    private boolean hasHelipad;

    /**
     * Constructs an aid ship with its identifying information,
     * operating details, emergency supplies, and helipad status.
     *
     * @param n         the name of the ship
     * @param rn        the ship's registration number
     * @param tn        the ship's tonnage
     * @param crewS     the number of crew members
     * @param cp        the ship's current port
     * @param currS     the ship's current speed
     * @param aidT      the type of aid carried by the ship
     * @param suppliesO the number of supply units onboard
     * @param helipad   whether the ship has a helipad
     */

    public AidShip(String n, String rn, double tn, int crewS,
                   String cp, double currS ,  String aidT,
                   int suppliesO, boolean helipad) {

        super(n, rn, tn, crewS, cp, currS);

        setAid(aidT);
        setSupp(suppliesO);
        setHeli(helipad);
    }

    //getters and setters for my instance variables
    public void setAid(String a){
        if (a == null) {
            throw new IllegalArgumentException("Aid type cannot be empty.");
        }
        aidType  = a;
    }
    public String getAid(){
        return aidType;
    }

    public void setSupp(int b){
        if (b < 0) {
            throw new IllegalArgumentException("Supplies cannot be negative");
        }
        suppliesOnBoard = b;
    }

    public int getSupp(){
        return suppliesOnBoard;
    }

    public void setHeli(boolean c){
        hasHelipad = c;
    }

    public boolean getHeli(){
        return hasHelipad;
    }


    //unloads the supplies
    private void unloadSupplies(){
        suppliesOnBoard = 0;
    }

    /**
     * Deploys all emergency aid carried by the ship and updates the
     * onboard supply amount to zero.
     */
    @Override
    public void deployAid() {
        System.out.println("Aid Ship " + getName()
                + " is deploying " + getSupp()
                + " units of " + getAid() + " aid.");

        setSupp(0);
    }

    /**
     * Docks the aid ship at a specified port and unloads all supplies.
     *
     * @param portN the name of the port where the ship will dock
     * @throws IllegalArgumentException if the port name is invalid
     */
    @Override
    public void dock(String portN){
        super.dock(portN);
        unloadSupplies();
    }

    @Override
    public String toString() {
        return "Aid Ship [name: " + getName()
                + ", registrationNumber: " + getRegi()
                + ", tonnage: " + getTon()
                + ", crewSize: " + getcsize()
                + ", currentSpeed: " + getSpeed()
                + ", currentPort: " + getPort()
                + ", aidType: " + aidType
                + ", suppliesOnBoard: " + suppliesOnBoard
                + ", hasHelipad: " + hasHelipad
                + " ]";
    }









}
