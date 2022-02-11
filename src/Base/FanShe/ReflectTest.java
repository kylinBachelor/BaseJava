package Base.FanShe;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.加载配置文件
        //1.1 创建properties
        Properties pro = new Properties();
        //1.2 加载配置文件，转换为一个集合
        //1.2.1 获取class目录下的配置文件
        /**
         * getClassLoader 取得该class对象的类装载器，
         * 类装载器负责从Java的字符文件将字符流读入内存，并构造class对象
         */
        ClassLoader classLoader1 = Person.class.getClassLoader();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        //2.获取配置文件中定义的资源、 全类名   方法名称
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        //3.加载该类进入内存
        Class<?> cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }
}
