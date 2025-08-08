package 设计模式.命令模式;


public class MultiCommand extends Command{

    @Override
    public int execute(int value) {
        super.memoryValue = value;
        return this.receiver.multi(value);
    }

    @Override
    public int reset() {
        return receiver.division(super.memoryValue);
    }
}
