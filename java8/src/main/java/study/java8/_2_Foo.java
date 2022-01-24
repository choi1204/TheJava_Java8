package study.java8;

import java.util.function.*;

public class _2_Foo {

    public static void main(String[] args) {

        //클래스로 구현
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

        //람다로 바로 구현
        Function<Integer, Integer> ramda_plus = i -> i + 10;
        System.out.println(ramda_plus.apply(1));

        Function<Integer, Integer> multiplay2 = i -> i * 2;
        System.out.println(multiplay2.apply(1));

        /**
         *        Compose로 함수형 인터페이스 조합.(고차함수)
         *        뒤의 함수 먼저 계산후 앞쪽함수.
         */

        Function<Integer, Integer> composeFunction = plus10.compose(multiplay2);
        System.out.println(composeFunction.apply(1));

        /**
         *        AndThem로 함수형 인터페이스 조합.(고차함수)
         *        앞쪽 함수 먼저 계산후 뒤뒤쪽함수.
        */

        Function<Integer, Integer> plusThemFunction = plus10.andThen(multiplay2);
        System.out.println(plusThemFunction.apply(1));

        /**
         *      Consumer<T>
         *      T 타입을 받아서 아무값도 리턴하지 않는 함수 인터페이스
         *      accept()가 추상메서드.
         */
        Consumer<Integer> printT = i -> System.out.println(i);
        printT.accept(1);

        /**
         *      Supplier<T>
         *      T 타입의 값을 제공하는 함수 인터페이스
         *      T get()가 추상 메서드.
         */
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        /**
         *      Predicate<T>
         *      T타입의 값을 받아서 true, false를 반환하는 함수 인터페이스
         *      test()가 추상메서드.
         *      and(), or(), negate() 메소드로 조합가능.
         */
        Predicate<String> startsWithChoi = s -> s.startsWith("Choi");
        System.out.println(startsWithChoi.test("Chisa"));

        /**
         *      UnaryOperator<T>
         *      입력값과 리턴값이 같을 때 사용.
         *      apply()
         *      Function을 상속받앗기에 Function기능 사용가능.
         */
        UnaryOperator<Integer> plus5 = i -> i + 5;
        System.out.println(plus5.apply(1));

        /**
         *      BinaryOperator<T>
         *      BiFunction<T, U, R>의 특수한 형태로, 동일한 타입의 입렵값 두개를 받아 리턴하는 함수
         *      인터페이스
         */
    }
}
