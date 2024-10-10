package main;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Hello world TeSt Test tesT test test 00 00 00\n"
                + "00 00 32 22 32 22 beta alpha alpha alpha hEllo hellO HelLo\n"
                + "HAHAHAHAHAHAHAHAHA HAHAHAHAHAHAHAHAHA HAHAHAHAHAHAHAHAHA\n"
                + "hahaHAHAHAHAHAHAHA HAHAHAHAHAHAHAHAHA HAHAHAHAHAHAHAHAHA";

        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split("\\W+");

        Arrays.stream(words)
                .map(String::toLowerCase)
                .forEach(word -> wordCount.put(word, wordCount.getOrDefault(word, 0) + 1)
        );

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCount.entrySet());

        sortedEntries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        sortedEntries.forEach(entry ->
                System.out.printf("%s | %d%n", entry.getKey(), entry.getValue())
        );
    }
}