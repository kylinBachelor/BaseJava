package 设计模式.外观模式;

public class Test {
    public static void main(String[] args) {
        Facade facade = new Facade(new Light(), new Air(), new TV());
        facade.allOpen();//print: 开灯, 打开空调，打开电视机
        facade.allDown();//print: 关闭电视机,关闭空调，关灯
    }
}
