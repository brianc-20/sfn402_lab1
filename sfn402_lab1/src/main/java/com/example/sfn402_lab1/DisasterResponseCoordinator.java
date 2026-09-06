package com.example.sfn402_lab1;

import java.util.ArrayList;


import java.util.ArrayList;

/**
 * Coordinates a group of emergency-support units.
 * The coordinator can register responders, deploy all registered
 * responders, and produce a readiness report.
 */
public class DisasterResponseCoordinator {

    private ArrayList<EmergencySupport> units;

    public DisasterResponseCoordinator() {
        units = new ArrayList<>();
    }

    /**
     * Registers an emergency-support unit with the coordinator.
     *
     * @param unit the emergency-support unit to register
     * @throws IllegalArgumentException if the unit is null
     */
    public void registerResponder(EmergencySupport unit) {
        units.add(unit);
    }

    public void deployAll() {
        System.out.println("Deploying all emergency units:");


        for (EmergencySupport responder : units) {
            responder.deployAid();

        }
    }

    /**
     * Returns a readiness report containing all registered responders.
     *
     * @return a formatted String containing the registered responders
     */

    @Override
    public String toString() {
        String result = "DisasterResponseCoordinator\n";
        result += "[responders:\n";

        for (EmergencySupport responder : units) {
            result += responder + "\n";
        }

        result += "]";

        return result;
    }

}
