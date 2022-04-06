/* City.java
 * Entity for City
 * Author: Mary-Beth Agulhas
 * Date: 31 March 2022
 */
package za.ac.cput.Entity;

public class City {
    private String cityId;
    private String cityName;
    private String country;

    private City(){}

    private City(Builder builder){
        this.cityId=builder.cityId;
        this.cityName=builder.cityName;
        this.country=builder.country;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
    public static class Builder{
        private String cityId;
        private String cityName;
        private String country;

        public Builder setCityId(String cityId){
            this.cityId=cityId;
            return this;
        }
        public Builder setCityName(String cityName){
            this.cityName=cityName;
            return this;
        }
        public Builder setCountry(String country){
            this.country=country;
            return this;
        }
        public Builder copy(City city){
            this.cityId=cityId;
            this.cityName=cityName;
            this.country=country;
            return this;
        }
        public City build(){
            return new City(this);
        }
    }
}
