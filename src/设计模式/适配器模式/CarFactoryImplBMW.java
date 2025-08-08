package 设计模式.适配器模式;

public class CarFactoryImplBMW implements CarFactory{
    public Car createCar() {
        return new Car("白色", "宝马");
    }
}
