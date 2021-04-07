package Task2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Address {
    
    private String streetName;
    private String city;

    public String getStreetName() { return streetName; }
    public void setStreetName(String value) { this.streetName = value; }

    public String getCity() { return city; }
    public void setCity(String value) { this.city = value; }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
