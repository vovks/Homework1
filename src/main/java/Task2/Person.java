package Task2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private PhoneNumbers phoneNumbers;
    private Addresses addresses;

    public String getFirstName() { return firstName; }
    public void setFirstName(String value) { this.firstName = value; }

    public String getLastName() { return lastName; }
    public void setLastName(String value) { this.lastName = value; }

    public PhoneNumbers getPhoneNumbers() { return phoneNumbers; }
    public void setPhoneNumbers(PhoneNumbers value) { this.phoneNumbers = value; }

    public Addresses getAddresses() { return addresses; }
    public void setAddresses(Addresses value) { this.addresses = value; }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", addresses=" + addresses +
                '}';
    }
}