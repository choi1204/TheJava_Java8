package study.java8.InterfaceChange;

public class DefaultFoo implements Foo, Bar {

    String name;

    DefaultFoo(String name) {
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public void printNameUpperCase() {

    }


    @Override
    public String getName() {
        return this.name;
    }
}
