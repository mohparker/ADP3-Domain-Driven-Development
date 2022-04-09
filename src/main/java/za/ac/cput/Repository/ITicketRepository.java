/*ITicketRepository.java
Repository for the interface ITicketRepository
Author: Zaakirah Fakier (220461503)
Date: 08 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.Ticket;

import java.util.Set;

public interface ITicketRepository extends IRepository<Ticket, String> {
    public Set<Ticket> getAll();
}

