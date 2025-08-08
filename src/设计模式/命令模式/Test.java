package 设计模式.命令模式;

/**
 * 将请求封装成命令，并记录下来，能够撤销与重做。
 * 将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。这样两者之间通过命令对象进行沟通，
 * 这样方便将命令对象进行储存、传递、调用、增加与管理。
 */
public class Test {
    public static void main(String[] args) {
        Command add = new AddCommand();
        Invoker invoker = new Invoker(add);
        invoker.calc(10);
        invoker.calc(20);
        invoker.cancel();

        Command multi = new MultiCommand();
        invoker.setCommand(multi);
        invoker.calc(3);
        invoker.calc(2);
        invoker.cancel();
    }
}
