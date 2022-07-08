package DesignModel.FactoryModel;

/**
 * @author congpeitong
 * @date 2022-05-27 09:57
 * 乘法
 */
public class OperationMul extends Operation {

    @Override
    public double GetResult() {
        double result = 0;
        result = super.getSuffixNumber() * super.getPrefixNumber();
        return result;
    }
}
