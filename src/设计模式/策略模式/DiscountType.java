package 设计模式.策略模式;

//折扣枚举类
public enum DiscountType {

    MEMBER("会员折扣", "设计模式.策略模式.MemberDiscount"),
    FIRST_ORDER("首次下单", "设计模式.策略模式.FirstOrderDiscount"),
    TOP100("前100名下单", "设计模式.策略模式.Top100Discount");

    private String name;

    private String className;

    DiscountType(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }
}
