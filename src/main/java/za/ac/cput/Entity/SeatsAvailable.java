package za.ac.cput.Entity;

public class SeatsAvailable {
    private int numberSeats;
    private int bookedSeats;
    private int reservedSeats;

    private SeatsAvailable (Builder builder){
        this.numberSeats= builder.numberSeats;
        this.bookedSeats= builder.bookedSeats;
        this.reservedSeats= builder.reservedSeats;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public int getReservedSeats() {
        return reservedSeats;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }
    public static class Builder{
        private int numberSeats;
        private int bookedSeats;
        private int reservedSeats;

        public Builder setNumberSeats(int numberSeats) {
            this.numberSeats = numberSeats;
            return this;
        }

        public Builder setBookedSeats(int bookedSeats) {
            this.bookedSeats = bookedSeats;
            return this;
        }

        public Builder setReservedSeats(int reservedSeats) {
            this.reservedSeats = reservedSeats;
            return this;
        }
        public Builder copy(SeatsAvailable seatsAvailable) {
            this.numberSeats = seatsAvailable.numberSeats;
            this.bookedSeats = seatsAvailable.bookedSeats;
            this.reservedSeats = seatsAvailable.reservedSeats;
            return this;
        }
        public SeatsAvailable Build(){
            return new SeatsAvailable(this);
        }
    }
}
