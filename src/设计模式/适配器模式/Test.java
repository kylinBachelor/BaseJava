package 设计模式.适配器模式;

public class Test {

    public static void main(String[] args){
        CarFactory bmwCar = new CarFactoryImplBMW();
        CarAdapter carAdapter = new CarAdapter(bmwCar);
        Car car = carAdapter.createCar();
        System.out.println("before change color : " + car);// Car(color=白色, band=宝马)

        carAdapter.changeColor(car, "红色");
        System.out.println("after change color : " + car);
    }
}
