package 设计模式.策略模式;

//首单五折
public class FirstOrderDiscount extends Discount{

    double discount = 0.5; //五折

    @Override
    public double discountPrice(Double originalPrice) {
        return originalPrice * discount;
    }
}


