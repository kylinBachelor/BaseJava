package DesignModel.FactoryModel;

/**
 * @author congpeitong
 * @date 2022-05-27 09:57
 * 减法
 */
public class OperationSub extends Operation {

    @Override
    public double GetResult() {
        double result = 0;
        result = super.getPrefixNumber() - super.getSuffixNumber();
        return result;
    }
}
