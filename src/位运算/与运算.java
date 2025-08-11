package 位运算;

public class 与运算 {

	public static void main(String[] args) {
		// 与运算：只有当两个对应位都为 1 时，结果位才为 1，否则为 0
		int a = 5; // 0101
        int b = 3; // 0011
        int result = a & b; // 0001
        System.out.println("5 & 3 = " + result);

	}

}
