package 设计模式.策略模式;

/**
 * 策略模式定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的变化不会影响使用算法的客户。策略模式属于对象行为模式
 * 它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。
 */
public class Test {
    public static void main(String[] args) {
         Double originalPrice = 200d;
        //首次下单
        DiscountType discountType = DiscountType.FIRST_ORDER;

        double price = Context.discountPrice(discountType, originalPrice);
        System.out.println("尊敬的用户: 您所预定的游乐园门票使用 [{" + discountType.getName() + "}] 折扣, 原价{" + originalPrice + "} RMB, 折后价格 {" + price + "} RMB ");
        //会员折扣
        discountType = DiscountType.MEMBER;
        price = Context.discountPrice(discountType, originalPrice);
        System.out.println("尊敬的用户: 您所预定的游乐园门票使用 [{" + discountType.getName() + "}] 折扣, 原价{" + originalPrice + "} RMB, 折后价格 {" + price + "} RMB ");
    }
   
}
