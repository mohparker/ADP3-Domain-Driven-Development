package za.ac.cput.repository;

import za.ac.cput.Entity.Airline;

import java.util.List;
import java.util.Set;

public interface IAirlineRepository extends IRepository<Airline, String> {

    public Set<Airline> getAll();

}
