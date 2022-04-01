/* FlightRepository.java
 Repository for the FlightRepository
 Author: Daniel Marais (219476845)
 Date: 30 March 2022
*

 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.Flight;

import java.util.HashSet;
import java.util.Set;

public class FlightRepository implements IFlightRepository{
    private static FlightRepository repository=null;
    private Set<Flight> flightDB=null;

    private FlightRepository(){flightDB= new HashSet<Flight>();}

    public static FlightRepository getRepository(){
        if(repository==null) {
            repository= new FlightRepository();

        }
        return repository;
    }

    @Override
    public Flight create(Flight flight) {
        boolean success= flightDB.add(flight);
        if(!success)
            return null;
        return flight;
    }

    @Override
    public Flight read(String flightId) {
        Flight flight=flightDB.stream()
                .filter(e ->e.getFlightId().equals(flightId))
                .findAny()
                .orElse(null);
        return flight;
    }

    @Override
    public Flight update(Flight flight) {
        Flight oldFlight=read(flight.getFlightId());
        if(oldFlight !=null){
            flightDB.remove((oldFlight));
            flightDB.add(flight);
            return flight;
        }
        return null;
    }

    @Override
    public boolean delete(String flightId) {
        Flight flightToDelete= read(flightId);
        if(flightToDelete==null)
            return false;
        flightDB.remove(flightToDelete);
        return true;

    }
    @Override
    public Set<Flight> getAll() {
        return null;
    }
}