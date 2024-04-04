package com.it.ciac;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        List<String> words = Files.readAllLines(Paths.get("C:\\Users\\utentepc\\coding\\java\\words.txt"));
        words.forEach(System.out::println);

        System.out.println(words.stream().count());

        System.out.println(words.stream().filter(v -> v.length() > 5).toList());

        words.stream().sorted().forEach(System.out::println);

        System.out.println(words.stream().mapToInt(v -> v.length()).max().getAsInt());
        System.out.println(words.stream().mapToInt(v -> v.length()).min().getAsInt());
        System.out.println(words.stream().mapToInt(v -> v.length()).average().getAsDouble());

        System.out.println(words.stream().filter(v -> v.charAt(0) == 'a').collect(Collectors.toList()));

        // erase duplicates
        words.stream().distinct().forEach(System.out::println);

        System.out.println(words.stream().anyMatch((v -> v.contains("pane"))));
        System.out.println(words.stream().allMatch((v -> v.length() >= 4)));

        words.stream().filter(v -> v.contains("pane")).forEach(System.out::println);

        Map<Integer, List<String>> mapWords = words.stream().collect(Collectors.groupingBy(v -> v.length()));
        System.out.println(mapWords);

        Map<Integer, Long> mapWords2 = words.stream()
                .collect(Collectors.groupingBy(v -> v.length(), Collectors.counting()));
        System.out.println(mapWords2);
    }
}
