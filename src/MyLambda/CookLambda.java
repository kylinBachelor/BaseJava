package MyLambda;

/**
 * 给定一个厨子cook接口，内部含有唯一的抽象方法，makeFood，且无参数，无返回值
 * 使用lambda 的标准格式调用invokeCook()方法，打印出"吃饭了"的字样
 */
public class CookLambda {
    public static void main(String[] args) {
        //lambda表达式方法
        invokeCook(()->{
            System.out.println("吃饭了");
        });
        //匿名类部类方法
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("喝水了");
            }
        });

    }
    private static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
