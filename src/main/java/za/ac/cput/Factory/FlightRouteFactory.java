package za.ac.cput.Factory;

import za.ac.cput.Entity.FlightRoute;
import za.ac.cput.Util.Helper;

public class FlightRouteFactory {
    public static FlightRoute createFlightRoute( String flightArrivalAirport, String flightDepartureAirport)
    {


        if(Helper.isNullorEmpty(flightArrivalAirport))
            return null;

        if(Helper.isNullorEmpty(flightDepartureAirport))
            return null;




        String routeId = Helper.generatedId();

        return new FlightRoute.Builder().setRouteId(routeId)
                .setFlightArrivalAirport(flightArrivalAirport)
                .setFlightDepartureAirport(flightDepartureAirport)
                .build();

    }
}
