package Base.invocationHandle.CGLib;

public class runCglib {
    public static void main(String[] args) {
        UserServiceProxyFactory factory = new UserServiceProxyFactory();
        UserService userServiceProxy = factory.getUserServiceProxy();
        userServiceProxy.save();
        //判断代理对象是否属于被代理对象的类型
        System.out.println(userServiceProxy instanceof UserServiceImpl);//ture

    }
}
