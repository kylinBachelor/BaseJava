package 设计模式.适配器模式;


public class CarFactoryImplAUDI implements CarFactory {
    public Car createCar() {
        return new Car("白色", "奥迪");
    }
}
