package 设计模式.组合模式;


public class Dota extends Game {

    public Dota(String name) {
        super(name);
    }

    public void display() {
        System.out.println("正在加载" + super.getName() + "游戏");
    }
}