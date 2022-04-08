/*TicketFactory.java
Factory for the TicketFactory
Author: Zaakirah Fakier (220461503)
Date: 07 April 2022
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Ticket;
import za.ac.cput.Util.Helper;

public class TicketFactory {

    public static Ticket createTicket(int ticketPrice, int ticketAmount){
        String ticketId = Helper.generatedId();
        Ticket ticket = new Ticket.Builder().setTicketId(ticketId)
                .setTicketPrice(ticketPrice)
                .setTicketAmount(ticketAmount)
                .build();
        return ticket;

    }
}
