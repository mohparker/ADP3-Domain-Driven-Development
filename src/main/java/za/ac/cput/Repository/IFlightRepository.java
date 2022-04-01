package za.ac.cput.Repository;

import za.ac.cput.Entity.Flight;

import java.util.Set;

public interface IFlightRepository extends IRepository <Flight,String>{
    //create, read, update, delete
    public Set<Flight> getAll();

    Flight create(Flight flight);
}