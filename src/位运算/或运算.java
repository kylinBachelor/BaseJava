package 位运算;

public class 或运算 {
	public static void main(String[] args) {
		// 或运算的规则是：只要两个对应位中有一个为 1，结果位就为 1，只有当两个位都为 0 时，结果位才为 0。
		int a = 5; //  0101
        int b = 3; //  0011
        int result = a | b; //  0111
        System.out.println("5 | 3 = " + result);
		
		
		
	}

}
