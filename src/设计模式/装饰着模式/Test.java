package 设计模式.装饰着模式;

public class Test {

    public static void main(String[] args) {
        Cake cake = new CakeImpl();
        System.out.println("小红想吃" + cake.nameDetail() + "，价格：￥" + cake.price());

        CakeDecorator cakeEgg = new EggCakeDecorator(cake);
        System.out.println("小明想吃" + cakeEgg.nameDetail() + "，价格：￥" + cakeEgg.price());

        CakeDecorator meetCake = new MeetCakeDecorator(cakeEgg);
        CakeDecorator veggCake = new VeggCakeDecorator(meetCake);

        System.out.println("小张想吃" + veggCake.nameDetail() + "，价格：￥" + veggCake.price());

    }
}
