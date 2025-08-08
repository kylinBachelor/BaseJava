package 设计模式.简单工厂模式;

public class SimpleFactory {
    public Phone createPhone(String brand){
        Phone phone = null;
        switch (brand){
            case "HUAWEI":
                phone = new HuaweiPhone();
                break;
            case "IPHONE":
                phone = new IPhone();
                break;
            default:
                System.out.println("暂不支持该品牌手机");
                break;
        }
        return phone;
    }
}
