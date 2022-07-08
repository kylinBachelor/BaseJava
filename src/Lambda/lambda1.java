package Lambda;

/**
 * Lambda 表达式标准格式
 * 三部分组成：
 *          1.一些参数
 *          2.一个箭头
 *          3.一段代码
 *标准格式为：
 *          （参数类型 参数名称）->{ 代码语句：一些重写方法的代码 };
 *解释说明格式：
 *          ():接口中抽象方法的参数列表，没有参数，就空着；具有参数就写出参数，多个参数用逗号隔开；
 *          ->:传递的意思，把参数传递给方法体{}
 *          {}：重写接口的抽象方法的方法体
 *
 */

public class lambda1 {
    public static void main(String[] args) {
        //使用匿名内部类的方式，实现多线程；
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "匿名类部类新线程创建了");
            }
        }).start();
        //使用lambda表达式，实现多线程
        new Thread(()->{
             System.out.println(Thread.currentThread().getName() + "lambda新线程创建了");
        }).start();
    }
}
