/*SeatsAvailable.Java
SeatsAvailable Entity
Author: Erin Rowan (215271157)
 */
package za.ac.cput.Entity;

public class SeatsAvailable {
    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    private String seatId;
    private int numberSeat;
    private String bookedSeat;
    private int reservedSeat;

    private SeatsAvailable (Builder builder){
        this.seatId= builder.seatId;
        this.numberSeat= builder.numberSeat;
        this.bookedSeat= builder.bookedSeat;
        this.reservedSeat= builder.reservedSeat;
    }


    public int getNumberSeat() {
        return numberSeat;
    }

    public void setNumberSeat(int numberSeat) {
        this.numberSeat = numberSeat;
    }

    public String getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(String bookedSeat) {
        this.bookedSeat = bookedSeat;
    }

    public int getReservedSeat() {
        return reservedSeat;
    }

    public void setReservedSeat(int reservedSeats) {
        this.reservedSeat = reservedSeats;
    }

    @Override
    public String toString() {
        return "SeatsAvailable{" +
                "seatId='" + seatId + '\'' +
                ", numberSeat=" + numberSeat +
                ", bookedSeat='" + bookedSeat + '\'' +
                ", reservedSeat=" + reservedSeat +
                '}';
    }


    public static class Builder{
        private String seatId;
        private int numberSeat;
        private String bookedSeat;
        private int reservedSeat;

        public Builder setSeatId(String seatId) {
            this.seatId = seatId;
            return this;
        }
        public Builder setNumberSeat(int numberSeat) {
            this.numberSeat = numberSeat;
            return this;
        }

        public Builder setBookedSeat(String bookedSeat) {
            this.bookedSeat = bookedSeat;
            return this;
        }

        public Builder setReservedSeat(int reservedSeat) {
            this.reservedSeat = reservedSeat;
            return this;
        }
        public Builder copy(SeatsAvailable seatsAvailable) {
            this.seatId= seatsAvailable.seatId;
            this.numberSeat = seatsAvailable.numberSeat;
            this.bookedSeat = seatsAvailable.bookedSeat;
            this.reservedSeat = seatsAvailable.reservedSeat;
            return this;
        }
        public SeatsAvailable build(){
            return new SeatsAvailable(this);
        }



    }
}
