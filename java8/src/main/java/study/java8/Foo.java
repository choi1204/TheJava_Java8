package study.java8;

public class Foo {

    public static void main(String[] args) {

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
    }
}
