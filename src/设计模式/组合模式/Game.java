package 设计模式.组合模式;

public abstract class Game {

     String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //展示游戏
    public abstract void display();

}
