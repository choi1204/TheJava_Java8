package study.java8.InterfaceChange;

public interface Bar {
    default void printNameUpperCase() {
        System.out.println("bar");
    };
}
