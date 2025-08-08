package 设计模式.装饰着模式;


public class VeggCakeDecorator extends CakeDecorator{

    public VeggCakeDecorator(Cake cake) {
        super(cake);
    }

    //关键部分
    @Override
    public String nameDetail() {
        return "蔬菜，" + cake.nameDetail();
    }

    @Override
    public Double price() {
        return 0.5 + cake.price();
    }
}