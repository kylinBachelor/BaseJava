package 设计模式.模板方法模式;

public class TeaDrink extends Drink{
    @Override
    void addMaterials() {
        System.out.println("加入绿茶");
    }

    @Override
    void addOther() {
        System.out.println("加入蜂蜜");
    }
}
