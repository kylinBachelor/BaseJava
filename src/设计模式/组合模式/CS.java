package 设计模式.组合模式;

public class CS extends Game{
    public CS(String name) {
        super(name);
    }
    public void display() {
        System.out.println("正在加载" + super.name + "游戏");
    }
}