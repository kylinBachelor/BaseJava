package DesignModel.StrategyModel;

/**
 * @author congpeitong
 * @date 2022-05-27 14:38
 * Context: 用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
 */
public class Context {
    Stragtegy stragtegy;

    public Context(Stragtegy stragtegy) { // 初始化时，传入具体的策略对象
        this.stragtegy = stragtegy;
    }

    // 上下文接口
    public void ContextInterface() { // 根据具体的策略对象，调用其算法的方法
        stragtegy.AlgorithmInterface();

    }
}
