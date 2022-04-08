/*TicketRepository.java
Repository for the TicketRepository
Author: Zaakirah Fakier (220461503)
Date: 08 April 2022
 */
package za.ac.cput.Repository;

import za.ac.cput.Entity.Ticket;

import java.util.HashSet;
import java.util.Set;

public class TicketRepository implements ITicketRepository{
    private static TicketRepository repository = null;
    private Set<Ticket> ticketDB = null;

    private TicketRepository(){
        ticketDB = new HashSet<Ticket>();
    }

    public static TicketRepository getRepository() {
        if (repository == null){
            repository = new TicketRepository();
        }
        return repository;
    }

    @Override
    public Ticket create(Ticket ticket) {
        boolean success = ticketDB.add(ticket);
        if(!success)

            return null;
        return ticket;

    }

    @Override
    public Ticket read(String ticketId) {
       /* for (CheckIn c: checkInDB) {
            if (c.getUserId().equals(userId))
                return c;
        }
        return null;*/
        Ticket ticket = ticketDB.stream()
                .filter(c -> c.getTicketId().equals(ticketId))
                .findAny()
                .orElse(null);
        return ticket;


    }

    @Override
    public Ticket update(Ticket ticket) {
        Ticket oldTicket = read(ticket.getTicketId());
        if(oldTicket !=null){
            ticketDB.remove(oldTicket);
            ticketDB.add(ticket);
            return ticket;

        }
        return null;


    }

    @Override
    public boolean delete(String ticketId) {
        Ticket ticketToDelete = read(ticketId);
        if (ticketToDelete == null)
            return false;
        ticketDB.remove(ticketToDelete);
        return true;
    }

    @Override
    public Set<Ticket> getAll() {
        return null;
    }
}
