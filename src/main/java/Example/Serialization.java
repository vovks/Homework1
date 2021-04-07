package Example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Serialization {
    public static void main(String[] args) throws IOException {
        ClassExample class1 = new ClassExample();
        class1.setId(567);
        class1.setName("Sveta");
        class1.setPermanent(false);

        List<Integer> array =new ArrayList<>();
        array.add(123456);
        array.add(345678);
        array.add(345678);
        class1.setPhoneNumbers(array);

        Address address = new Address();
        address.setStreet("Rokossovskogo");
        address.setCity("Kiev");
        address.setZipcode(14034);
        class1.setAddress(address);

        class1.setRole("Engineer");

        List<String> array2 =new ArrayList<>();
        array2.add("Rivne");
        array2.add("Chernihiv");
        class1.setCities(array2);

        Properties properties = new Properties();
        properties.setAge("31 years");
        properties.setSalary("900 USD");
        class1.setProperties(properties);

        ObjectMapper mapper = new ObjectMapper();
        String workingFolder = System.getProperty("user.dir");
        String separator = System.getProperty("file.separator");
        String resourcesFolder = workingFolder + separator + "src" + separator + "main" + separator + "resources";

        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(new File(resourcesFolder + separator + "example2.json"), class1);


    }
}
