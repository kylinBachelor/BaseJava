package 设计模式.简单工厂模式;

public class HuaweiPhone implements Phone{
    @Override
    public void make() {
        System.out.println("华为手机制作完成");

    }

    @Override
    public void call() {
        System.out.println("华为手机拨打电话");
    }
    
}
