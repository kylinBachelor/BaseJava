package 设计模式.策略模式;


public abstract class Discount {
  //计算折扣抽象方法
    abstract double discountPrice(Double originalPrice);
}