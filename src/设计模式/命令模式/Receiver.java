package 设计模式.命令模式;

public class Receiver {
    private int number;

    public int add(int value){
        System.out.println("加法：" + number + " + " + value + " = " + (number + value));
        return number += value;
    }

    public int subtract(int value){
        System.out.println("减法：" + number + " - " + value + " = " + (number - value));

        return number -= value;
    }

    public int multi(int value){
        System.out.println("乘法：" + number + " * " + value + " = " + (number * value));
        return number *= value;
    }

    public int division(int value){
        System.out.println("除法：" + number + " / " + value + " = " + (number / value));
        return number /= value;
    }
}
