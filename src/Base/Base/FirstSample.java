package Base.Base;

import java.util.Arrays;

/**
 * 1. 类名是以大写字母开头的名词。如果名字由多个单词组成，每个单词的第一个字母都应该大写
 *    这种在一个单词中间使用大写字母的方式称为骆驼命名法 例如： FirstSample.class
 * 2. 源代码的文件名必须与公共类的名字相同
 * 3. 编译完成会获得字节码文件，命名为 FirstSample.class
 */
public class FirstSample {
    public static void main(String[] args) {
        System.out.println("We will not use 'hello world' ");
        int[] a = {1,2,3,4};
        int[] ts = Arrays.copyOf(a, a.length); // 拷贝
        System.out.println(a);
        System.out.println(ts);
        int[] ints = Arrays.copyOfRange(a, 0, 2);




    }
}
