package invocationHandle.JDKproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
public class ProxyRun {
    public static void main(String[] args) {
        //被真实代理的类， 处理实际业务
        Subject subject = new RealSubject();
        //实现invocationHandle 的代理类
        InvocationHandler h = new ProxySubject(subject);
        //动态生成代理类对象
        Subject subjectProxy = (Subject) Proxy.newProxyInstance(h.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),h);
        subjectProxy.subjectRun("Hello real subject");
    }

}
