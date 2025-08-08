package 设计模式.装饰着模式;


public class EggCakeDecorator extends CakeDecorator{
    public EggCakeDecorator(Cake cake) {
        super(cake);
    }
    //关键部分
    @Override
    public String nameDetail() {
        return "鸡蛋，" + cake.nameDetail();
    }
    @Override
    public Double price() {
        return 1.5 + cake.price();
    }
}