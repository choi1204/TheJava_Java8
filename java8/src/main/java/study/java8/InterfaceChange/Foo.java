package study.java8.InterfaceChange;

import java.util.Locale;


public interface Foo {

    void printName();

    /**
     * @ImplSpec
     * 이 구현체는 getName()으로 가져와 문자열을 대문자로 바꿔 출력한다.
     */
    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    };

    static void printAnything() {
        System.out.println("FOO");
    }
    String getName();
}
