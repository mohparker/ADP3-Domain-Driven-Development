package za.ac.cput.Entity;

public class Airline {
    private int planeId;
    private int airlineCode;
    private int numberFlights;
    private int numberPlane;
    private String airlineName;


    private Airline(Builder builder) {
        this.planeId = builder.planeId;
        this.airlineCode = builder.airlineCode;
        this.numberFlights = builder.numberFlights;
        this.numberPlane = builder.numberPlane;
        this.airlineName = builder.airlineName;
    }

    public int getPlaneId() {
        return planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    public int getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(int airlineCode) {
        this.airlineCode = airlineCode;
    }

    public int getNumberFlights() {
        return numberFlights;
    }

    public void setNumberFlights(int numberFlights) {
        this.numberFlights = numberFlights;
    }

    public int getNumberPlane() {
        return numberPlane;
    }

    public void setNumberPlane(int numberPlane) {
        this.numberPlane = numberPlane;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "planeId=" + planeId +
                ", airlineCode=" + airlineCode +
                ", numberFlights=" + numberFlights +
                ", numberPlane=" + numberPlane +
                ", airlineName='" + airlineName + '\'' +
                '}';
    }

    public static class Builder {
        private int planeId;
        private int airlineCode;
        private int numberFlights;
        private int numberPlane;
        private String airlineName;

        public Builder setPlaneId(int planeId) {
            this.planeId = planeId;
            return this;
        }

        public Builder setAirlineCode(int airlineCode) {
            this.airlineCode = airlineCode;
            return this;
        }

        public Builder setNumberFlights(int numberFlights) {
            this.numberFlights = numberFlights;
            return this;
        }

        public Builder setNumberPlane(int numberPlane) {
            this.numberPlane = numberPlane;
            return this;
        }

        public Builder setAirlineName(String airlineName) {
            this.airlineName = airlineName;
            return this;
        }

        public Builder copy(Airline airline) {
            this.airlineCode = airline.airlineCode;
            this.airlineName = airline.airlineName;
            this.numberFlights = airline.numberFlights;
            this.numberPlane = airline.numberPlane;
            this.planeId = airline.planeId;
            return this;


        }

        public Airline build() {
            return new Airline(this);
        }
    }
}
