package study.java8.InterfaceChange;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

/**
 * 6강 인터페이스 기본 메소드와 스태틱 메소드2
 * Iterable, Collection, Comparator
 */
public class _2_App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("choi");
        name.add("kim");
        name.add("park");
        name.add("woong");

        // Iterable
        name.forEach(System.out::println);
        System.out.println("==============");
        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("==================");
        while (spliterator1.tryAdvance(System.out::println));
        System.out.println("===================");
        name.stream(); // stream은 spliterator로 내부에 구현되어있다.

        //Collection
        List<String> c = name.stream().map(String::toUpperCase)
                .filter(s -> s.startsWith("c"))
                .collect(Collectors.toList());
        name.removeIf(s -> s.startsWith("c"));
        name.forEach(System.out::println);

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());
        //추가 정렬 원할시 thenCompparing추가


    }
}
