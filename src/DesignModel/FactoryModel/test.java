package DesignModel.FactoryModel;

/**
 * @author congpeitong
 * @date 2022-05-27 10:10
 * 测试类
 */
public class test {
    public static void main(String[] args) throws Exception {
        double suffixNumber = 3.0;
        double prefixNumber = 2.0;
        Operation operation = OperationFactory.createOperation("+");
        operation.setPrefixNumber(prefixNumber);
        operation.setSuffixNumber(suffixNumber);
        double result = operation.GetResult();
        System.out.println(result);
    }
}
