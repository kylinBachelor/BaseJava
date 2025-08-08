package 设计模式.桥接模式;

public class CarImpl extends Car {
    public void makeCar(String carType) {
        color.addColor(carType);
    }
}