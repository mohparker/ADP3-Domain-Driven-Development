/*TicketRepositoryTest.java
Repository for the TicketRepositoryTest
Author: Zaakirah Fakier (220461503)
Date: 08 April 2022
 */
package za.ac.cput.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.Entity.Ticket;
import za.ac.cput.Factory.TicketFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class TicketRepositoryTest {

    private static TicketRepository repository = TicketRepository.getRepository();
    private static Ticket ticket = TicketFactory.createTicket(512,345);

    @Test
    void a_create() {
        Ticket created = repository.create(ticket);
        assertEquals(ticket.getTicketId(), created.getTicketId());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        Ticket read = repository.read(ticket.getTicketId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        Ticket updated = new Ticket.Builder().copy(ticket).setTicketPrice(235)
                .setTicketAmount(32)
                .build();
        assertNotNull(repository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() {
        boolean success = repository.delete(ticket.getTicketId());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all: ");
        System.out.println(repository.getAll());
    }
}