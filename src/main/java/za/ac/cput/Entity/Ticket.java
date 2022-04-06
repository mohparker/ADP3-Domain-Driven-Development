/*Ticket.java
Entity for the Ticket
Author: Zaakirah Fakier (220461503)
Date: 31 March 2022
 */

package za.ac.cput.Entity;

public class Ticket {
    private String ticketId;
    private int ticketPrice;
    private int ticketAmount;


    private Ticket(Builder builder){
        this.ticketId = builder.ticketId;
        this.ticketPrice = builder.ticketPrice;
        this.ticketAmount = builder.ticketAmount;

    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getTicketAmount() {
        return ticketAmount;
    }

    public void setTicketAmount(int ticketAmount) {
        this.ticketAmount = ticketAmount;
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId='" + ticketId + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", ticketAmount=" + ticketAmount +
                '}';
    }

    public static class Builder{
        private String ticketId;
        private int ticketPrice;
        private int ticketAmount;

        public Builder setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        public Builder setTicketPrice(int ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }

        public Builder setTicketAmount(int ticketAmount) {
            this.ticketAmount = ticketAmount;
            return this;
        }



        public Builder copy(Ticket ticket){
            this.ticketId = ticket.ticketId;
            this.ticketPrice = ticket.ticketPrice;
            this.ticketAmount = ticket.ticketAmount;
            return this;

        }

        public Ticket build(){
            return new Ticket(this);

        }
    }
}
