package Task2;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Person person = new Person();
        person.setFirstName("Name");
        person.setLastName("Surname");
        PhoneNumbers phoneNumbers = new PhoneNumbers();
        String[] array = {"12345","321456"};
        phoneNumbers.setPhoneNumbers(array);
        person.setPhoneNumbers(phoneNumbers);

        Address address = new Address();
        address.setStreetName("Malinovskogo");
        address.setCity("Kiev");

        Address address1 = new Address();
        address1.setStreetName("Rokossovskogo");
        address1.setCity("Rivne");

        Addresses addresses = new Addresses();
        Address[] array2 = {address,address1};
        addresses.setAddress(array2);
        person.setAddresses(addresses);

        System.out.println(person);

        XmlMapper xmlMapper = new XmlMapper();

        String workingFolder = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String resourcesFolder = workingFolder + separator + "src" + separator + "main" + separator + "resources";

        xmlMapper.writeValue(new File(resourcesFolder + separator + "example2.xml"), person);
        File file = new File("example3.xml");

    }
}
