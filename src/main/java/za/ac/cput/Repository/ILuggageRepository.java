/*ILuggageRepository.java
Interface for Luggage Repository
Author: Erin Rowan(215271157)
*/
package za.ac.cput.Repository;

import za.ac.cput.Entity.Luggage;

import java.util.Set;

public interface ILuggageRepository extends IRepository<Luggage,String> {
    public Set<Luggage> getAll();

    Luggage create(Luggage luggage);
}
