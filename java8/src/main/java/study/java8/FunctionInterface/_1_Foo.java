package study.java8.FunctionInterface;

public class _1_Foo {

    public static void main(String[] args) {

        /*
        return type이 void일때

        //익명 내부 클래스
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doiT() {
                System.out.println("Hello");
                System.out.println("Lamda");
            }
        };

        //Java 8 부터는 람다로 표현가능.
        RunSomething runSomething2 = () -> System.out.println("Hello");

        //1줄이 아닐경우에는
        RunSomething runSomething3 = () -> {
            System.out.println("Hello");
            System.out.println("Lamda");
        };
         */

        // return type이 int일때
        RunSomething runSomething = number -> number + 10;
        System.out.println(runSomething.doiT(1));

        //함수형 인터페이스가 지역변수를 참조할경우 지역변수를 final 취급.

        int baseNumber = 1;
        RunSomething runSomething1 = number -> number + baseNumber;
        // baseNumber++; 불가능

        /**
         * 순수함수를 가져가기 위해서 주의해야한다.
         * 함수 밖에 있는 값을 참조하거나 변경하면 안된다.
         * 오로지 함수 내부의 값이나 함수로 넘어오는 파라미터만을 사용해야 한다.
         */

    }

}
