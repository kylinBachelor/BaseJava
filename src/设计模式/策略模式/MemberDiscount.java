package 设计模式.策略模式;

//会员七折
public class MemberDiscount extends Discount{

    double discount = 0.7; //七折

    @Override
    public double discountPrice(Double originalPrice) {
        return originalPrice * discount;
    }
}
