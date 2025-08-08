package 设计模式.装饰着模式;

public class MeetCakeDecorator extends CakeDecorator{
    public MeetCakeDecorator(Cake cake) {
        super(cake);
    }

    //关键部分
    @Override
    public String nameDetail() {
        return "牛肉，" + cake.nameDetail();
    }
    @Override
    public Double price() {
        return 2 + cake.price();
    }
}
