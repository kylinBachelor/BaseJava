package DesignModel.StrategyModel;

/**
 * @author congpeitong
 * @date 2022-05-27 14:53
 */
public class main {
    public static void main(String[] args) {
        Context context;
        context  = new Context(new ConcreteStrategyA());
        context.ContextInterface();
        context  = new Context(new ConcreteStrategyB());
        context.ContextInterface();
        context  = new Context(new ConcreteStrategyC());
        context.ContextInterface();
    }
}
