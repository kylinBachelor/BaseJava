package 设计模式.命令模式;


public abstract class Command {

    //需要加载接收者类，将receiver加载
    final static Receiver receiver = new Receiver();

    int memoryValue;

    public abstract int execute(int value);

    //撤销操作
    public abstract int reset();

}