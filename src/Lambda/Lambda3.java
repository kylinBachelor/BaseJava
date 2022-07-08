package Lambda;

public class Lambda3 {
    public static void main(String[] args) {
        //匿名内部类格式
        invokeCalc(3, 4, new Calculator() {
            @Override
            public int cale(int a, int b) {
                return a + b;
            }
        });
        //lambda表达式格式
        invokeCalc(3,7, (int a,int b)->{
            return a+b;
        });

    }
    private static  void invokeCalc(int a, int b, Calculator calculator){
        int result = calculator.cale(a,b);
        System.out.println("结果是" + result);
    }
}
