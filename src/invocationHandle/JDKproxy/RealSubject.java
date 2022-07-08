package invocationHandle.JDKproxy;

//被真正代理的类，用来处理实际业务
public class RealSubject implements Subject {
    @Override
    public void subjectRun(String param) {
        System.out.println("代理对象的方法被执行了! " + param);
    }
}
