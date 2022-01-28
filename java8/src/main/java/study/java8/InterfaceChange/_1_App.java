package study.java8.InterfaceChange;

/**
 *  5강 인터페이스 기본 메소드와 스태틱 메소드
 *  추후에 interface에 추가 method생성시 interface구현체 모두 재정의 해야하는 문제발생.
 *  ->default method로 처리.
 *  defalut method는 모든 구현체에 동작하기에 모두 정상적으로 동작이 안할수도 있음
 *  방지를 위한 최소한의 노력으로 @implSpec을 사용하여서 문서화할것.
 *  문제가 있을경우 @Override를 통해 재정의 가능하다.
 *  Object의 Mehtod의 경우에는 재정의 불가능.
 *
 *  2개이상의 인터페이스를 상속받은 클래스에서 동일한 메소드명을 가진 default Method가 있다면
 *  반드시 오버라이드해서 직접 구현해주어야한다.
 */

public class _1_App {

    public static void main(String[] args) {
        Foo foo = new DefaultFoo("choi");
        foo.printNameUpperCase();

        Foo.printAnything();
    }
}
