package Lesson12;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.File;
import java.io.IOException;

public class MainClazzToJson {
    public static void main(String[] args) {

        MateGroup mateGroup = MateGroup.mateGroupExampleCreator();
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        try {

            writer.writeValue(new File("src/main/resources/mateGroup.json"), mateGroup);
            System.out.println(writer.writeValueAsString(mateGroup));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
