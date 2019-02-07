package testScripts.fileListInDirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFileByStream {
    public static void main(String[] args) throws IOException {
        String pathToFile = "D:\\___SEC_TOPICS\\";
        Path source = Paths.get(pathToFile);
        Files.walk(source).filter(Files::isRegularFile).forEach(System.out::println);
    }
}
