package Task2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import java.util.Arrays;

public class PhoneNumbers {
    @JacksonXmlElementWrapper(useWrapping = false)
    private String[] phoneNumbers;

    public String[] getPhoneNumbers() { return phoneNumbers; }
    public void setPhoneNumbers(String[] value) { this.phoneNumbers = value; }

    @Override
    public String toString() {
        return "PhoneNumbers{" +
                "phoneNumbers=" + Arrays.toString(phoneNumbers) +
                '}';
    }
}
