/*CheckIn.java
Entity for the CheckIn
Author: Zaakirah Fakier (220461503)
Date: 31 March 2022
 */
package za.ac.cput.Entity;

public class CheckIn {
    private String userId;
    private String flightId;
    private boolean priorityBoard;
    private int seatReservation;
    private int overWeightFee;


    private CheckIn(Builder builder){
        this.userId = builder.userId;
        this.flightId = builder.flightId;
        this.priorityBoard = builder.priorityBoard;
        this.seatReservation = builder.seatReservation;
        this.overWeightFee = builder.overWeightFee;

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public boolean isPriorityBoard() {
        return priorityBoard;
    }

    public void setPriorityBoard(boolean priorityBoard) {
        this.priorityBoard = priorityBoard;
    }

    public int getSeatReservation() {
        return seatReservation;
    }

    public void setSeatReservation(int seatReservation) {
        this.seatReservation = seatReservation;
    }

    public int getOverWeightFee() {
        return overWeightFee;
    }

    public void setOverWeightFee(int overWeightFee) {
        this.overWeightFee = overWeightFee;
    }

    @Override
    public String toString() {
        return "CheckIn{" +
                "userId='" + userId + '\'' +
                ", flightId='" + flightId + '\'' +
                ", priorityBoard=" + priorityBoard +
                ", seatReservation=" + seatReservation +
                ", overWeightFee=" + overWeightFee +
                '}';
    }


    public static class Builder{
        private String userId;
        private String flightId;
        private boolean priorityBoard;
        private int seatReservation;
        private int overWeightFee;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setFlightId(String flightId) {
            this.flightId = flightId;
            return this;
        }

        public Builder setPriorityBoard(boolean priorityBoard) {
            this.priorityBoard = priorityBoard;
            return this;
        }

        public Builder setSeatReservation(int seatReservation) {
            this.seatReservation = seatReservation;
            return this;
        }

        public Builder setOverWeightFee(int overWeightFee) {
            this.overWeightFee = overWeightFee;
            return this;
        }

        public Builder copy(CheckIn checkIn){
            this.userId = checkIn.userId;
            this.flightId = checkIn.flightId;
            this.priorityBoard = checkIn.priorityBoard;
            this.seatReservation = checkIn.seatReservation;
            this.overWeightFee = checkIn.overWeightFee;
            return this;

        }

        public CheckIn build(){
            return new CheckIn(this);

        }
    }
}
