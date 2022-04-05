package za.ac.cput.Factory;

import za.ac.cput.Entity.Flight;
import za.ac.cput.Util.Helper;

public class FlightFactory {
    public static Flight createFlight(String dateOfFlight, String timeOfFlight, int numberOfPassengers){
        String flightId= Helper.generatedId();
        return new Flight.Builder().setFlightId(flightId)
                .setDateOfFlight(dateOfFlight)
                .setTimeOfFlight(timeOfFlight)
                .setNumberOfPassengers(numberOfPassengers)
                .builder();

    }
}
