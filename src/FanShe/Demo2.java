package FanShe;

import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * @author congpeitong
 * @date 2022-08-01 13:24
 */
public class Demo2 {

    public static void main(String[] args) throws Exception{
       
        //Class<Person> personClass = Person.class;

        //Class<?> uC = Class.forName("FanShe.Person");

        Person person = new Person();
        Class<?> pC = person.getClass();

        pC.getMethod(null, null);
        Field nameField = pC.getField("name");
        nameField.get(null);
      
    }
}
