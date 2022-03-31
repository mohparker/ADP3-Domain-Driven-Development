/* Plane.java
   Entity for the Plane
   Author: Juan-Lee Zidane Klink (218236883)
   Date: 30 March 2022
 */
package za.ac.cput.Entity;

public class Plane {
    private String planeId;
    private String flightId;
    private String color;
    private String modelNumber;
    private String modelDate;

    //Constructor
    private Plane(Builder builder){
        this.planeId = builder.planeId;
        this.flightId = builder.flightId;
        this.color = builder.color;
        this.modelNumber = builder.modelNumber;
        this.modelDate = builder.modelDate;
    }

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelDate() {
        return modelDate;
    }

    public void setModelDate(String modelDate) {
        this.modelDate = modelDate;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "planeId='" + planeId + '\'' +
                ", flightId='" + flightId + '\'' +
                ", color='" + color + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", modelDate='" + modelDate + '\'' +
                '}';
    }

    public static class Builder {
        private String planeId;
        private String flightId;
        private String color;
        private String modelNumber;
        private String modelDate;

        public Builder setPlaneId(String planeId) {
            this.planeId = planeId;
            return this;
        }

        public Builder setFlightId(String flightId) {
            this.flightId = flightId;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setModelNumber(String modelNumber) {
            this.modelNumber = modelNumber;
            return this;
        }

        public Builder setModelDate(String modelDate) {
            this.modelDate = modelDate;
            return this;
        }

        public Builder copy(Plane plane){
            this.planeId = plane.planeId;
            this.flightId = plane.flightId;
            this.color = plane.color;
            this.modelNumber = plane.modelNumber;
            this.modelDate = plane.modelDate;
            return this;
        }

        public Plane build(){
            return new Plane(this);
        }
    }


}

