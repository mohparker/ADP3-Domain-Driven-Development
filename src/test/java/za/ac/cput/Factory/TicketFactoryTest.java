/*TicketFactoryTest.java
Test for the TicketFactoryTest
Author: Zaakirah Fakier (220461503)
Date: 07 April 2022
 */
package za.ac.cput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.Entity.Ticket;

import static org.junit.jupiter.api.Assertions.*;

class TicketFactoryTest {


    @Test
    public void test(){
        Ticket ticket = TicketFactory.createTicket(4999,2);
        assertNotNull(ticket);
        System.out.println(ticket.toString());
    }
}