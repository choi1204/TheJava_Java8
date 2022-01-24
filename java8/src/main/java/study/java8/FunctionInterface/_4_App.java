package study.java8.FunctionInterface;

import org.springframework.boot.web.server.GracefulShutdownResult;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * 4강 메소드 레퍼런스
 *  static method 사용 -> 클래스::사용.
 *  instance method 사용 - > instance::사용
 *  메소드 레퍼런스에 넣고 실제 작동하는 함수를 동작해야 method를 호출함.
 *  그전에는 래퍼런스값만 가지고 있음.
 *
 *  ::(더블콜론)
 *  메소드 레퍼런스라고 부르며 람다식과 똑같은 기능제공.
 *  람다와의 차이점은 인스턴스를 활용하여 메소드를 전달한다.
 */
public class _4_App {
    public static void main(String[] args) {

        //static method
        UnaryOperator<String> hi = Greeting::hi;

        //instance method
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;

        //실제로 instace생성안됨. get()을 해야 생성.
        Supplier<Greeting> supplier = Greeting::new;

        //String을 인자로 받는 Greeting생성자 레퍼런스 위의 Supplier와 다름.
        Function<String, Greeting> choiGreeting = Greeting::new;
        Greeting choi = choiGreeting.apply("choi");
        System.out.println(choi.getName());

        //임의 객체에 인스턴스참조방법
        String[] names = {"choi", "hyun", "woong"};

        //익명클래스 버전.
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        //람다버전
        Arrays.sort(names, (o1, o2) -> o1.compareTo(o2));

        //메소드 래퍼런스 버전
        Arrays.sort(names, String::compareToIgnoreCase);

    }
}
