package 设计模式.适配器模式;

public class Car {
    private String color;//颜色
    private String band;//品牌

    public Car() {
    }

    public Car(String color, String band) {
        this.color = color;
        this.band = band;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

}
