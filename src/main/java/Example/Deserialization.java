package Example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Deserialization {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        String fileName = "example1.json";
        ClassLoader classLoader = Deserialization.class.getClassLoader();
        File fileAbsolute = new File(classLoader.getResource(fileName).getFile());
        String absolutePath = fileAbsolute.getAbsolutePath();

        Path file = Paths.get(absolutePath);

        ClassExample classExample = objectMapper.readValue(file.toFile(), ClassExample.class);
        System.out.println(classExample);
    }
}
