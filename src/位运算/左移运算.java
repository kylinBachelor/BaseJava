package 位运算;

public class 左移运算 {

	public static void main(String[] args) {
		// 左移运算会将二进制位向左移动指定的位数，右边空出的位用 0 填充。
		int a = 5; //  0101
        int result = a << 2; //  010100
        System.out.println("5 << 2 = " + result);

	}

}
