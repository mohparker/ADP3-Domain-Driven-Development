/*ICheckInRepository.java
Repository for the interface ICheckInRepository
Author: Zaakirah Fakier (220461503)
Date: 08 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.CheckIn;

import java.util.Set;

public interface ICheckInRepository extends IRepository<CheckIn, String> {

    public Set<CheckIn> getAll();

}
