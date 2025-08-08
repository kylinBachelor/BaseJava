package 设计模式.命令模式;


public class AddCommand extends Command {

    @Override
    public int execute(int value) {
        super.memoryValue = value;
        return super.receiver.add(value);
    }

    @Override
    public int reset() {
        return super.receiver.subtract(memoryValue);
    }
}