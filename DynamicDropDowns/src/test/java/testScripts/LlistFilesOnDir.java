package testScripts;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LlistFilesOnDir {

    /*List<String> results = new ArrayList<String>();


    File[] files = new File("/path/to/the/directory").listFiles();
//If this pathname does not denote a directory, then listFiles() returns null.

    for (File file : files) {
        if (file.isFile()) {
            results.add(file.getName());
        }
    }*/

    File[] files = new File("D:\\__TMP").listFiles();
    List<String> names = Arrays.asList(files).parallelStream().map(file -> file.getName()).collect(Collectors.toList());


    /*List<String> results = new ArrayList<String>();
    private String pathToFiles = "D:\\__TMP";
    File[] files = new File(pathToFiles).listFiles();

    for (File file : files) {
        if (file.isFile()) {
            results.add(file.getName());
        }
    }*/

    public static void main(String[] args) {
        System.out.println("cos");
    }

    /*private String pathToFile = "D:\\__TMP";
    File folder = new File(pathToFile);
    */
}
