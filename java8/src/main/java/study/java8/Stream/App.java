package study.java8.Stream;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 7강 Stream
 */
public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("choi");
        names.add("hyun");
        names.add("kim");
        names.add("park");

        List<String> collect = names.parallelStream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
