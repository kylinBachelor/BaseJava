package 设计模式.简单工厂模式;

public class Test {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Phone huaweiPhone = factory.createPhone("HUAWEI");
        huaweiPhone.make();
        huaweiPhone.call();

        Phone iPhone = factory.createPhone("IPHONE");
        iPhone.make();
        iPhone.call();
    }
}
