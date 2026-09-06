package com.example.sfn402_lab1;

public interface PassengerServices {
    /**
     * Starts the ship's entertainment services when they are available.
     */
    void startEntertainment();

    /**
     * Returns a manifest containing the passenger ship's information.
     *
     * @return a formatted String containing the passenger manifest
     */
    String getPassengerManifest();
}
