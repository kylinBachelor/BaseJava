package 设计模式.中介者模式;

/**
 * 所谓中介者模式就是用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互。
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Seller seller = new Seller("宋江", mediator);
        Buyer buyer = new Buyer("矮脚虎", mediator);

        mediator.setSeller(seller);
        mediator.setBuyer(buyer);

        seller.contact("我有三十套房, 打算卖10套");
        buyer.contact("我要买套房, 打算买1套");

    }
}
