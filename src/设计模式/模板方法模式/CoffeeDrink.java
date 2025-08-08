package 设计模式.模板方法模式;

public class CoffeeDrink extends Drink {
    @Override
    void addMaterials() {
        System.out.println("加入咖啡");

    }

    @Override
    void addOther() {
        System.out.println("加入牛奶");
    }
}