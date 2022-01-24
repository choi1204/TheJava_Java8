package study.java8;

@FunctionalInterface
public interface RunSomething {

    /**
     * 추상메서드가 1개만 있으면 함수형 인터페이스.
     * (다른메서드는 있어도 됨.)
     * 2개가 있을경우에는 x
     * interface에서는 abstract 생략가능.
     * @FunctionalInterface 어노테이션 사용시 위반될때 에러뜸.
     * Java8부터 default method, static method 선언 가능.
     */

    void doiT();

    static void printName() {
        System.out.println("Choi");
    }

    default  void printAge() {
        System.out.println("26");
    }

}
