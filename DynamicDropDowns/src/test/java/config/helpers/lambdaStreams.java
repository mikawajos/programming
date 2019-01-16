package config.helpers;

import java.util.Arrays;
import java.util.List;

public class lambdaStreams {
    static List fruits = Arrays.asList("jablka", "gruszki", "costam", "kiwi","pomidor", "ananasy");

    public static void main(String[] args) {
        fruits.stream().filter(s -> s.toString().startsWith("g")).map(s -> s.toString().toUpperCase()).sorted().forEach(System.out::println);
        fruits.stream().filter(s -> s.toString().startsWith("p")).map(s -> s.toString().toUpperCase()).sorted().forEach(System.out::println);
    }
}
