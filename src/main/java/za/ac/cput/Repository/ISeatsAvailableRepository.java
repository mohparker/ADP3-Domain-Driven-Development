/*ISeatsAvailableRepository.java
Interface for SeatsAvailable Repository
Author: Erin Rowan(215271157)
*/
package za.ac.cput.Repository;

import za.ac.cput.Entity.SeatsAvailable;

import java.util.Set;

public interface ISeatsAvailableRepository  extends IRepository<SeatsAvailable, String>{
    public Set<SeatsAvailable> getAll();

    SeatsAvailable create(SeatsAvailable seatsAvailable);
}
