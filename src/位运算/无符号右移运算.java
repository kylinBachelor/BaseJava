package 位运算;

public class 无符号右移运算 {

	public static void main(String[] args) {
		int a = -5; //  11111111111111111111111111111011
        int result = a >>> 1; //  01111111111111111111111111111101
        System.out.println("-5 >>> 1 = " + result);
	}

}
