package Base.Base;

/**
 *     2 5,2 4,2 3, 2 2, 2 1,
 *
 *     101： 4 + 0 + 1   010: 0 + 2 + 0
 */

/**
 * 左移一位相当于十进制数乘上2的一次方，左移两位相当于十进制数乘上2的2次方。
 * 右移一位则是除法 有余数舍弃余数。
 */
public class yiweiyunsuan {
    public static void main(String[] args) {
        int number = 011;  // 1011
        //原始数二进制
        printInfo(number);
//        number = number << 3;
//        //左移一位
//        printInfo(number);
        number = number >>> 1;
        //右移一位
        printInfo(number);
    }

    /**
     * 输出一个int的二进制数
     * @param num
     */
    private static void printInfo(int num){
//        System.out.println(num);
        System.out.println(Integer.toBinaryString(num));
    }
}
