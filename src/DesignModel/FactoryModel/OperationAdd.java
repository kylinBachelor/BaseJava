package DesignModel.FactoryModel;

/**
 * @author congpeitong
 * @date 2022-05-27 09:57
 * 加法
 */
public class OperationAdd extends Operation {

    @Override
    public double GetResult() {
        double result = 0;
        result = super.getSuffixNumber() + super.getPrefixNumber();
        return result;
    }
}
