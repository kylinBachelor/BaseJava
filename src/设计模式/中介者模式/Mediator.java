package 设计模式.中介者模式;

public abstract class Mediator {
    //收集信息，转发信息
    public abstract void contact(String message, Person person);
}
