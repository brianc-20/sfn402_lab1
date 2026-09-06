package com.example.sfn402_lab1;

/**
 * The Lab1 class serves as the entry point for demonstrating disaster response
 * coordination and entity interaction. This class defines the main method where
 * objects of different emergency support units (such as AidShip, RescueHelicopter,
 and MobileClinicTruck)
 * and a disaster response coordinator are created and used to simulate disaster
 * response operations.
 *
 * Functionality includes:
 * - Creating instances of AidShip, RescueHelicopter, and MobileClinicTruck.
 * - Registering these responders with a DisasterResponseCoordinator instance.
 * - Simulating the deployment of all registered responders.
 * - Displaying the state of responders and the DisasterResponseCoordinator.
 * - Demonstrating the behavior of other supporting classes such as PassengerShip
 * including docking, navigation, and operational features like entertainment.
 *
 * This class orchestrates the entire workflow by combining individual responder
 * functionalities and demonstrating how they operate in a disaster response
 setting.
 *
 * @author CS3443
 */
public class Lab1 {
    public static void main(String[] args) {
// Create responders
        AidShip aidShip = new AidShip("Madleen", "AID-001", 8000, 120, "Melona",
                12, "Medical", 200, true);
        RescueHelicopter helicopter = new RescueHelicopter("ECHO-7", "Melona", 50,
                true);
        MobileClinicTruck truck = new MobileClinicTruck("TRK-12", "OLV", 5, true);
// Register responders
        DisasterResponseCoordinator coordinator = new
                DisasterResponseCoordinator();
        coordinator.registerResponder(aidShip);
        coordinator.registerResponder(helicopter);
        coordinator.registerResponder(truck);
// Simulate deployment
        coordinator.deployAll();
        System.out.println();
// Display the String representation of the coordinator
        System.out.println(coordinator);
        System.out.println();
// Passenger ship use case
        PassengerShip passengerShip = new PassengerShip("PAL-123", "VIDA-107",
                10000, 100, "Melona", 30, 70,60, 20, true);
        System.out.println(passengerShip);
        passengerShip.navigateTo("Iceland", 21);
        passengerShip.startEntertainment();
        passengerShip.dock("Leve");
        System.out.println(passengerShip.getPassengerManifest());
        System.out.println(passengerShip);
    }
}
