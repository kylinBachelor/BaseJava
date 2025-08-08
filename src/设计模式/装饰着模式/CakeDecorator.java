package 设计模式.装饰着模式;

public class CakeDecorator implements Cake{
    Cake cake;
    //装饰实现类
    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }
    public String nameDetail() {
        return cake.nameDetail();
    }
    public Double price() {
        return cake.price();
    }
}