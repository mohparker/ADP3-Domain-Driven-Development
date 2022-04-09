package za.ac.cput.Repository;

import za.ac.cput.Entity.Airline;

import java.util.Set;

public interface IAirlineRepository extends IRepository<Airline, String> {

    public Set<Airline> getAll();

}
