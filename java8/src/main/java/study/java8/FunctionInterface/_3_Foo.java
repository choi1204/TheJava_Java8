package study.java8.FunctionInterface;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * 3강 람다표현식
 * -effitive final-
 * 익명클래스와 로컬 클래스는 쉐도잉이 됨. (별도의 scope를 가짐.)
 * 람다에서는 쉐도잉이 안됨. (람다의 scope는 사실상 람다를 쓰는 메소드영역과 같다.)
 * 외부 변수가 final처럼 사용되지 않을경우 람다에서 참조가 불가능하다.
 */
public class _3_Foo {

    public static void main(String[] args) {
        _3_Foo foo = new _3_Foo();
        foo.run();
    }

    private void run() {

        //사실상 final변수
        int baseNumber = 10;

        //로컬 클래스
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        }

        //익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int baseNumber = 11;
                System.out.println(baseNumber);
            }
        };

        //람다
        IntConsumer printInt = i -> {
        //    int baseNumber = 12; 같은 scope여서 변경 불가.
            System.out.println(i + baseNumber);
        };
        printInt.accept(1);
    }

}
