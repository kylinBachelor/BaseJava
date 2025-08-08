package 设计模式.中介者模式;

public class Seller extends Person {
    public Seller(String name, Mediator mediator) {
        super(name, mediator);
    }


    //联系中介者
    public void contact(String message){
        mediator.contact(message, this);
    }


    //处理消息
    public void getMessage(String message){
        System.out.println("卖家家：" + super.name + "，收到信息：" + message);

    }
}