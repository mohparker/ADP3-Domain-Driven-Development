/* ICabinCrewRepository.java
   Interface for the CabinCrewRepository
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 7 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.CabinCrew;
import za.ac.cput.Entity.Plane;

import java.util.Set;

public interface ICabinCrewRepository extends IRepository<CabinCrew, String>{

    public Set<CabinCrew> getAll();
}
