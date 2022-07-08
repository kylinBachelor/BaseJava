package invocationHandle.JDKproxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 1.通过实现InvocationHandler接口定义自己的InvocationHandler。
 * 2.通过Proxy.getProxyClass0方法获得动态代理类。
 * 3.通过反射机制获取动态代理类的构造方法，getConstructor(InvocationHandler.class)。
 * 4.通过构造函数获得代理对象，并将第一步时自定义的InvocationHandler实例对象作为入参，newInstance(new Object[]{InvocationHandler})。
 * 5.通过代理对象调用方法。
 */
//定义代理类需要实现invocationhandle
public class ProxySubject implements InvocationHandler {
    //真正被代理的对象
    private Object subject;
    //通过构造方法对代理对象赋值
    public ProxySubject(Object subject) {
        this.subject = subject;
    }

    /**
     * @param proxy 动态生成的代理类
     * @param method 被代理的类的方法
     * @param args 调用被代理类的入参
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("目标对象方法执行之前对方法加强！");
        method.invoke(subject, args);
        //subject:被代理的对象， args: 调用方法的入参
        System.out.println("目标对象方法执行之后对方法的加强！ ");

        return result;
    }
}
