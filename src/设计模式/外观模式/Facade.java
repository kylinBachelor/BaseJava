package 设计模式.外观模式;

public class Facade {

    Light light;
    Air air;
    TV tv;

    public Facade(Light light, Air air, TV tv) {
        this.light = light;
        this.air = air;
        this.tv = tv;
    }

    public void allOpen(){
        light.open();
        air.open();
        tv.open();
    }

    public void allDown(){
        tv.down();
        air.down();
        light.down();
    }
}
