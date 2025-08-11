package 位运算;

public class 右移运算 {

	public static void main(String[] args) {
		// 右移运算会将二进制位向右移动指定的位数，左边空出的位用符号位填充（正数用 0 填充，负数用 1 填充）。
		int a = 5; //  0101 
        int result = a >> 1; //  0010 
        System.out.println("5 >> 1 = " + result);

	}

}
