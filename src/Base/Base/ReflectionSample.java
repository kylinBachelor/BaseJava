package Base.Base;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author congpeitong
 */
public class ReflectionSample {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        Class<Person> personClass = Person.class;
        Person person = new Person("cong", "23", "山东省菏泽市巨野县麒麟镇后屯村");
        Class<?> aClass = Class.forName("Base.Base.Person");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        Method toEat = aClass.getMethod("toEat");
        Object o = aClass.newInstance();
        toEat.invoke(o);


    }
}
