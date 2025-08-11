package 位运算;

public class 取反运算 {
	public static void main(String[] args) {
		// 取反运算会将每一位取反，即 0 变为 1，1 变为 0。
		int a = 5; //  0101
        int result = ~a; //  1010
        System.out.println("~5 = " + result);
	}
}
