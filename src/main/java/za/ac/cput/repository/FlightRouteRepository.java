package za.ac.cput.repository;

import za.ac.cput.Entity.FlightRoute;

import java.util.HashSet;
import java.util.Set;

public class FlightRouteRepository implements IFlightRouteRepository {

    private static FlightRouteRepository repository = null;
    private Set<FlightRoute> flightRouteDB = null;

    private FlightRouteRepository(){flightRouteDB = new HashSet<FlightRoute>();
    }

    public static FlightRouteRepository getRepository()
    {
        if(repository == null)
        {
            repository = new FlightRouteRepository();
        }
        return repository;
    }

    @Override
    public Set<FlightRoute> getAll() {
        return null;
    }

    @Override
    public FlightRoute create(FlightRoute flightRoute) {
        boolean success = flightRouteDB.add(flightRoute);
        if(!success)
            return null;
        return flightRoute;
    }

    @Override
    public FlightRoute read(String RouteId) {
        for (FlightRoute f : flightRouteDB)
            if (f.getRouteId().equals(RouteId))
                return f;
        return null;


        /* FlightRoute flightroute = flightrouteDB.stream()
        .filter(f-> f.getRouteID().equals(RouteID))
        .findAny()
        .orElse(null);
        return flightroute;

         */
    }

    @Override
    public FlightRoute update(FlightRoute flightRoute) {
        FlightRoute oldFlightRoute = read(flightRoute.getRouteId());
        if (oldFlightRoute !=null)
        {
            flightRouteDB.remove(oldFlightRoute);
            flightRouteDB.add(flightRoute);
                    return flightRoute;
        }
        return null;
    }

    @Override
    public boolean delete(String RouteId) {
        FlightRoute flightRouteToDelete =  read(RouteId);
        if (flightRouteToDelete == null)

            return false;
            flightRouteDB.remove(flightRouteToDelete);

        return true;


    }
}
