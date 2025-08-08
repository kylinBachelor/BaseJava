package 设计模式.装饰着模式;

public class CakeImpl implements Cake {
    /**
     * 手抓饼配料->鸡蛋，牛肉，蔬菜,
     * 组合方式：1.鸡蛋，2.牛肉，3.蔬菜，4. 鸡蛋+牛肉，5. 鸡蛋+蔬菜，6.牛肉＋蔬菜, 7.鸡蛋+牛肉+蔬菜
     */
    public String nameDetail() {
        return "原味手抓饼";
    }
    public Double price() {
        return 5d;
    }
}