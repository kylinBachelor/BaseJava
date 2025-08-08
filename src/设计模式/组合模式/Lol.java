package 设计模式.组合模式;

public class Lol extends Game {

    public Lol(String name) {
        super(name);
    }

    public void display() {
        System.out.println("正在加载" + super.getName() + "游戏");
    }
}