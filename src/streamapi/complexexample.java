package streamapi;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class complexexample {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "avocado", "blueberry", "cherry");
        Map<Character,List<String>> byFirstLetter = words.stream()
                .collect(Collectors.groupingBy(w->w.charAt(0)));
        System.out.println(byFirstLetter);

        Map<Character,Long>countByFirstLetter = words.stream()
                .collect(Collectors.groupingBy(w->w.charAt(0),
                        Collectors.counting()));
        System.out.println(countByFirstLetter);

        String joined = words.stream()
                .collect(Collectors.joining(", ","[","]"));
        System.out.println(joined);

    }
}
