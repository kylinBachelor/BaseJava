package DesignModel.FactoryModel;

/**
 * @author congpeitong
 * @date 2022-05-27 09:57
 * 除法
 */
public class OperationDiv extends Operation {

    @Override
    public double GetResult() throws Exception {
        double result = 0;
        if (super.getSuffixNumber() == 0) {
            throw new Exception("除数不能为0");
        }
        result = super.getPrefixNumber() / super.getSuffixNumber();
        return result;
    }
}
