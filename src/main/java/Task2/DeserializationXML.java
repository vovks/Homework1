package Task2;

import Example.Deserialization;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeserializationXML {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        String fileName = "HometaskXML.xml";
        ClassLoader classLoader = Deserialization.class.getClassLoader();
        File fileAbsolute = new File(classLoader.getResource(fileName).getFile());
        String absolutePath = fileAbsolute.getAbsolutePath();

        Path file = Paths.get(absolutePath);

        Person value = xmlMapper.readValue(file.toFile(),Person.class);

        System.out.println(value);

    }
}
