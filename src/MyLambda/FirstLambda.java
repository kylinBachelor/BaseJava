package MyLambda;

import java.util.function.Predicate;

public class FirstLambda{

    /**
     * 1. Java SE8引入了lambda表达式的概念
     * 2. 编写lambda表达式分解为理解三个步骤
     *    + 标识要编写的lambda表达式的类型
     *    + 找到正确的实施方法
     *    + 实现此方法
     * 
     * lambda 表达式的类型有一个限制：它必须是一个功能接口。因此，不实现函数接口的匿名类不能编写为 lambda 表达式。
     */
    public static void main(String[] args) {
        Predicate<String> predicate = (String s) -> {
            return s.length() == 3;
        };
        System.out.println(predicate.toString());
    }

}
