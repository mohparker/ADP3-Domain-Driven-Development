package za.ac.cput.Entity;

public class Luggage {
    private String luggageId;
    private String luggageOwner;
    private int numberBags;
    private int handLuggageWeight;
    private int cargoStorageWeight;

    private Luggage (Builder builder){
        this.luggageId=builder.luggageId;
        this.luggageOwner=builder.luggageOwner;
        this.numberBags=builder.numberBags;
        this.handLuggageWeight=builder.handLuggageWeight;
        this.cargoStorageWeight=builder.cargoStorageWeight;
    }

    public String getLuggageId() {
        return luggageId;
    }

    public String getLuggageOwner() {
        return luggageOwner;
    }

    public int getNumberBags() {
        return numberBags;
    }

    public int getHandLuggageWeight() {
        return handLuggageWeight;
    }

    public int getCargoStorageWeight() {
        return cargoStorageWeight;
    }

    public void setLuggageId(String luggageId) {
        this.luggageId = luggageId;
    }

    public void setLuggageOwner(String luggageOwner) {
        this.luggageOwner = luggageOwner;
    }

    public void setNumberBags(int numberBags) {
        this.numberBags = numberBags;
    }

    public void setHandLuggageWeight(int handLuggageWeight) {
        this.handLuggageWeight = handLuggageWeight;
    }

    public void setCargoStorageWeight(int cargoStorageWeight) {
        this.cargoStorageWeight = cargoStorageWeight;
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "luggageId='" + luggageId + '\'' +
                ", luggageOwner='" + luggageOwner + '\'' +
                ", numberBags=" + numberBags +
                ", handLuggageWeight=" + handLuggageWeight +
                ", cargoStorageWeight=" + cargoStorageWeight +
                '}';
    }
    public static class Builder{
        private String luggageId;
        private String luggageOwner;
        private int numberBags;
        private int handLuggageWeight;
        private int cargoStorageWeight;

        public Builder setLuggageId(String luggageId) {
            this.luggageId = luggageId;
            return this;
        }

        public Builder setLuggageOwner(String luggageOwner) {
            this.luggageOwner = luggageOwner;
            return this;
        }

        public Builder setNumberBags(int numberBags) {
            this.numberBags = numberBags;
            return this;
        }

        public Builder setHandLuggageWeight(int handLuggageWeight) {
            this.handLuggageWeight = handLuggageWeight;
            return this;
        }

        public Builder setCargoStorageWeight(int cargoStorageWeight) {
            this.cargoStorageWeight = cargoStorageWeight;
            return this;
        }
        private Builder copy(Luggage luggage){
            this.luggageId=luggage.luggageId;
            this.luggageOwner=luggage.luggageOwner;
            this.numberBags=luggage.numberBags;
            this.handLuggageWeight=luggage.handLuggageWeight;
            this.cargoStorageWeight=luggage.cargoStorageWeight;
            return this;
        }
        public Luggage build(){
            return new Luggage(this);
        }
    }
}
