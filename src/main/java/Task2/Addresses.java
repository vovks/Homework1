package Task2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.Arrays;

public class Addresses {
    @JacksonXmlElementWrapper(useWrapping = false)
    private Address[] address;

    public Address[] getAddress() { return address; }
    public void setAddress(Address[] value) { this.address = value; }

    @Override
    public String toString() {
        return "Addresses{" +
                "address=" + Arrays.toString(address) +
                '}';
    }
}
