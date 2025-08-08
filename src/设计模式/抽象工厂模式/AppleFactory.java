package 设计模式.抽象工厂模式;

public class AppleFactory implements AbstractFactory {


    @Override
    public PC makePC() {
        return new ApplePC();
    }


    @Override
    public Phone makePhone() {
        return new ApplePhone();
    }

}
