package 设计模式.抽象工厂模式;

public class Test {
    public static void main(String[] args) {
        AbstractFactory huaweiFactory = new HuaweiFactory();
        PC huaweiPC = huaweiFactory.makePC();
        huaweiPC.playGame();
        Phone huaweiPhone = huaweiFactory.makePhone();
        huaweiPhone.call("西施");

        AbstractFactory appleFactory = new AppleFactory();
        PC applePC = appleFactory.makePC();
        applePC.playGame();
        Phone iphone = appleFactory.makePhone();
        iphone.call("程咬金");
    }
}
