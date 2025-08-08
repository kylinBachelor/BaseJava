package 设计模式.抽象工厂模式;

public class HuaweiFactory implements AbstractFactory {

    @Override
    public PC makePC() {
        return new HuaweiPC();
    }
    @Override
    public Phone makePhone() {
        return new HuaweiPhone();
    }
}