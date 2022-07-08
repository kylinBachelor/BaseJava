package invocationHandle;

import java.util.ArrayList;
/**
 * Lambda的使用前提
 *      1.使用Lambda必须具有接口，且要求接口中有且仅有一个抽象方法。
 *      2.使用Lambda必须具有上下文推断
 *          也就是方法的参数或局部变量类型必须为Lambda对应的接口类型，才能使用Lambda作为该接口的实力

 * lambda 表达式:可推到，可省略
 * 凡是根据上下文推导出来的内容，都可以省略书写
 * 可以省略的内容：
 *          1.（参数列表）：括号中的参数列表的数据类型，可以省略不写
 *          2.（参数列表) : 括号中的参数如果只有一个，那么类型和（）可以省略不写
 *          3.{一些代码} ： 如果{}中的代码只有一行，无论是否有返回值，都乐意省略{}，return，分号
 *                         注意：要省略（），return，分号必须一起省略
 */
public class Lambda4 {
    public static void main(String[] args) {
        //JDK 1.7 版本之前，创建集合对象必须把前后的泛型都写上
        ArrayList<String> list01 = new ArrayList<String>();
        //JDK 1.7 版本之后，=后面的反省可以省略，后面的泛型可以根据前面的泛型推导出啦
        ArrayList<String> list02 = new ArrayList<>();
    }
}
