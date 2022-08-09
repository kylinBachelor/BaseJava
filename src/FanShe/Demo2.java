package FanShe;

import java.lang.reflect.Modifier;

/**
 * @author congpeitong
 * @date 2022-08-01 13:24
 */
public class Demo2 {

    public static void main(String[] args) {
        Class<?> personClass = Person.class;

        System.out.println(personClass.getName());
        System.out.println(personClass.getFields());
        System.out.println(personClass.getConstructors());
        System.out.println(personClass.getMethods());
    }
}
