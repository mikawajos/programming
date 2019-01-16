package config.helpers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class readFromFile {

    public static String fileNameTxt = "C:\\bdlog.txt";
    public static void main(String[] args) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(fileNameTxt))) {
            stream.forEach(System.out::println);
        }
    }
}
