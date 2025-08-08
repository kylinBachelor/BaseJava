package 设计模式.简单工厂模式;

public class IPhone implements Phone{
    @Override
    public void make() {
        System.out.println("苹果手机制作完成");

    }

    @Override
    public void call() {
        System.out.println("苹果手机拨打电话");
    }
    
}
