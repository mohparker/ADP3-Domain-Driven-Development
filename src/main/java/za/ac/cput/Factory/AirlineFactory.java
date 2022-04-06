package za.ac.cput.Factory;

import za.ac.cput.Entity.Airline;
import za.ac.cput.Util.Helper;

public class AirlineFactory {
    public static Airline createAirline(int airlineCode, int numberFlights, int numberPlane, String airlineName)
    {





        if(Helper.isNullorEmpty(String.valueOf(airlineCode)))
            return null;

        if(Helper.isNullorEmpty(String.valueOf(numberFlights)))
            return null;

        if(Helper.isNullorEmpty(String.valueOf(numberPlane)))
            return null;

        if(Helper.isNullorEmpty(airlineName))
            return null;

        String planeId = Helper.generatedId();


        return new Airline.Builder().setPlaneId(planeId)
                .setAirlineCode(airlineCode)
                .setNumberFlights(numberFlights)
                .setNumberPlane(numberPlane)
                .setAirlineName(airlineName)
                .build();
    }
}
