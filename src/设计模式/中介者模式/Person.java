package 设计模式.中介者模式;

public abstract class Person {
    String name;
    Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}