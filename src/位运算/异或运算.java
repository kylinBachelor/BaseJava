package 位运算;

import DesignModel.SegregationPrinciple.main;

public class 异或运算 {
	public static void main(String[] args) {
		// 异或运算的规则是：当两个对应位不同时，结果位为 1，相同时结果位为 0。
		 int a = 5; // 0101
        int b = 3; // 0011
        int result = a ^ b; //  0110
        System.out.println("5 ^ 3 = " + result);
}
}
