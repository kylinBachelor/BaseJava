package 设计模式.适配器模式;

public class CarAdapter implements Car4s {
    CarFactory carFactory;
    public CarAdapter(CarFactory carFactory) {
        this.carFactory = carFactory;
    }
    public Car createCar(){
        return carFactory.createCar();
    }
    public Car changeColor(Car car, String color) {
        if(car == null) return null;
        car.setColor(color);
        return car;
    }
}
