package 位运算;

public class 实际应用 {

	public static void main(String[] args) {
		// 1. 权限
		
		
		// 2. 交换两个变量的值
	}
}

class 权限 {
	public static final int READ_PERMISSION = 1; // 0001
    public static final int WRITE_PERMISSION = 2; // 0010
    public static final int EXECUTE_PERMISSION = 4; // 0100

    private int permissions;

    public 权限() {
        this.permissions = 0;
    }

    // 添加权限
    public void addPermission(int permission) {
        permissions = permissions | permission;
    }

    // 检查权限
    public boolean hasPermission(int permission) {
        return (permissions & permission) == permission;
    }

    public static void main(String[] args) {
    	权限 manager = new 权限();
        manager.addPermission(READ_PERMISSION);
        manager.addPermission(WRITE_PERMISSION);
        System.out.println( manager.hasPermission(READ_PERMISSION));
        System.out.println(manager.hasPermission(EXECUTE_PERMISSION));
    }

}


class 交换变量值 {
	public static void main(String[] args) {
		int a = 5;
        int b = 3;
        System.out.println(" a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(" a = " + a + ", b = " + b);
	}
	
}