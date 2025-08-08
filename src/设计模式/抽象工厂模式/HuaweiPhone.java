package 设计模式.抽象工厂模式;

public class HuaweiPhone implements Phone {

    @Override
    public void call(String receiver) {
        System.out.println("华为手机拨打{" + receiver + "}电话");
    }
}