package com.example.sfn402_lab1;

/**
 * Represents a mobile clinic truck that can navigate to different
 * regions and provide medical support during emergencies.
 */
public class MobileClinicTruck implements Navigable, EmergencySupport{


    /**
     * Constructs a mobile clinic truck with its identification,
     * assigned region, doctor count, and medicine status.
     *
     * @param truck  the truck's identification number
     * @param reg    the region assigned to the truck
     * @param count  the number of doctors assigned to the truck
     * @param stockM whether the truck is stocked with medicine
     */
    private String truckID;
    private String region;
    private int doctorCount;
    private double currSpeed;
    private boolean stockMed;


    public MobileClinicTruck(String truck, String reg, int count, boolean stockM){

        setTruckID(truck);
        setRegion(reg);
        setDoctorCount(count);
        setCurrSpeed(0.0);
        setStockMed(stockM);

    }


    //getters and setters
    public void setTruckID(String ID){
        if (ID == null) {
            throw new IllegalArgumentException("Truck ID cannot be empty.");
        }
        truckID = ID;
    }

    public String getTruckID(){
        return truckID;
    }

    public void setRegion(String regi){
        if (regi == null) {
            throw new IllegalArgumentException("Region cannot be empty.");
        }
        region = regi;
    }

    public String getRegion(){
        return region;
    }

    public void setDoctorCount(int dc){
        if (dc < 0) {
            throw new IllegalArgumentException(
                    "Doctor count cannot be negative.");
        }
        doctorCount =dc;

    }

    public int getDoctorCount(){
        return doctorCount;
    }

    public void setCurrSpeed(double currSpeed){
        if (currSpeed < 0) {
            throw new IllegalArgumentException(
                    "Current speed cannot be negative.");
        }
        this.currSpeed = currSpeed;
    }

    public double getCurrSpeed(){
        return  currSpeed;
    }

    public void setStockMed(boolean stockMed){
        this.stockMed = stockMed;
    }

    public boolean getStockM(){
        return stockMed;
    }

    @Override
    public void navigateTo(String destination, double speed) {
        if (destination == null) {
            throw new IllegalArgumentException(
                    "Destination cannot be empty.");
        }

        setCurrSpeed(speed);
        setRegion(destination);

        System.out.println(truckID + " is traveling to "
                + destination + " at " + currSpeed + " mph.");
    }

    @Override
    public void deployAid() {
        System.out.println("Mobile clinic truck " + truckID
                + " deploying " + doctorCount + " doctors.");

        setStockMed(false);
    }

    @Override
    public String toString() {
        return "MobileClinicTruck [ truckId: " + truckID
                + ", region: " + region
                + ", doctorCount: " + doctorCount
                + ", stockedWithMedicine: " + stockMed
                + " ]";
    }



}
