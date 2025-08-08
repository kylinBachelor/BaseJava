package 设计模式.命令模式;

public class Invoker {
    //调用者发送命令, 所以需要将命令类关联进来
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void calc(int value){
        int result = command.execute(value);
        System.out.println("计算操作：执行结果：" + result);

    }

    public void cancel(){
        int result = command.reset();
        System.out.println("撤销操作：执行结果：" + result);

    }
}
