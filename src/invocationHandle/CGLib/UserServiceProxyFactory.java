package invocationHandle.CGLib;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;
public class UserServiceProxyFactory implements MethodInterceptor {
    public UserService getUserServiceProxy(){
        Enhancer enhancer = new Enhancer();  //帮我们生成代理对象
        enhancer.setSuperclass(UserServiceImpl.class);  //设置对谁进行代理
        enhancer.setCallback(this); //代理要做什么
        UserService us = (UserService) enhancer.create(); //创建代理对象
        return us;
    }
    /**
     *
     * @param o
     * @param method 被代理的方法
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //打开事务
        System.out.println("打开事务");
        //调用原有的方法
        Object returnValue = methodProxy.invokeSuper(o, objects);
        //提交事务
        System.out.println("提交事务");
        return returnValue;
    }
}
