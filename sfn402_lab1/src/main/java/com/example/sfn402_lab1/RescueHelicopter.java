package com.example.sfn402_lab1;

/**
 * Represents a rescue helicopter that can navigate to destinations
 * and deploy medical aid during emergencies.
 */
public class RescueHelicopter implements Navigable, EmergencySupport{


    private String callsign;
    private String baselocation;
    private int medkits;
    private double altitude;
    private double currentSpeed;
    private boolean rescuehoist;


    /**
     * Constructs a rescue helicopter with its call sign, base location,
     * medical supplies, and rescue-hoist status.
     *
     * @param callS   the helicopter's call sign
     * @param baseL   the helicopter's base location
     * @param medK    the number of medical kits onboard
     * @param rescueh whether the helicopter has a rescue hoist
     */

    public RescueHelicopter(String callS, String baseL, int medK, boolean rescueh){
        setCallsign(callS);
        setBaselocation(baseL);
        setAlt(0.0);
        setCurrentSpeed(0.0);
        setMedkits(medK);
        setRescueH(rescueh);


    }


    //getters and setters
    public void setCallsign(String c){
        callsign = c;
    }

    public String getCallsign(){
        return callsign;
    }

    public void setBaselocation(String sbl){
        baselocation = sbl;
    }

    public String getBaselocation() {
        return baselocation;
    }

    public void setMedkits(int gmk){
        medkits = gmk;
    }

    public int getMedkits(){
        return medkits;
    }

    public void setAlt(double a){
        altitude = a;
    }

    public double getAlt(){
        return altitude;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }


    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void setRescueH(boolean st){
        rescuehoist = st;
    }

    public boolean isRescuehoist(){
        return rescuehoist;
    }


    @Override
    public void navigateTo(String destination, double speed) {
        setCurrentSpeed(speed);
        setAlt(1000.0);

        System.out.println(callsign + " is navigating toward "
                + destination + " at " + currentSpeed
                + " mph and an altitude of " + altitude + " feet.");
    }

    @Override
    public void deployAid() {
        System.out.println("Rescue helicopter " + callsign
                + " deploying " + medkits + " medical kits.");

        setMedkits(0);
    }




    @Override
    public String toString() {
        return "RescueHelicopter [callSign:'" + callsign
                + "', baseLocation: " + baselocation
                + ", currentSpeed: " + currentSpeed
                + ", altitude: " + altitude
                + ", medicalKits: " + medkits
                + ", hasRescueHoist: " + rescuehoist
                + " ]";
    }




}
