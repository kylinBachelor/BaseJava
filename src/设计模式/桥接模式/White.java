package 设计模式.桥接模式;

public class White implements Color {
    @Override
    public void addColor(String carType) {
        System.out.println("汽车类型：" + carType + "，喷漆颜色：白色");
    }
}
