package za.ac.cput.Repository;

import za.ac.cput.Entity.Airline;

import java.util.HashSet;
import java.util.Set;

public class AirlineRepository implements IAirlineRepository  {
    private static AirlineRepository repository = null;
    private Set<Airline> airlineDB = null;

    private AirlineRepository()
    {
        airlineDB = new HashSet<Airline>();
    }


    public static AirlineRepository getRepository()
    {
        if(repository == null)
        {
            repository = new AirlineRepository();
        }
        return repository;
    }


    @Override
    public Airline create(Airline airline)
    {
        boolean success = airlineDB.add(airline);
        if(!success)
        return null;
        return airline;
    }

    @Override
    public Airline read(String planeID) {
       for (Airline a : airlineDB)
           if (a.getPlaneId().equals(planeID))
               return a;
       return null;
    }

    @Override
    public Airline update(Airline airline) {
        Airline oldAirline = read(airline.getPlaneId());
        if(oldAirline !=null)
        {
            airlineDB.remove(oldAirline);
            airlineDB.add(airline);
            return airline;
        }
        return null;
    }

    @Override
    public boolean delete(String planeId) {
     Airline airlineToDelete = read(planeId);
     if(airlineToDelete == null)
        return false;
    airlineDB.remove(airlineToDelete);
     return true;
    }

    @Override
    public Set<Airline> getAll() {
        return null;
    }
}
