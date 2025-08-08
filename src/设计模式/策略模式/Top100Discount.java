package 设计模式.策略模式;


//前100名下单八折
public class Top100Discount extends Discount{

    double discount = 0.8; //八折

    @Override
    public double discountPrice(Double originalPrice) {
        return originalPrice * discount;
    }
}
