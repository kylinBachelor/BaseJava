package Base.FanShe;

import javax.xml.bind.SchemaOutputResolver;
import java.lang.reflect.Field;

//获取字节码问价class对象的三种方式
public class ReflectDemo1 {
   /* *获取字节码问价class对象的三种方式：将字节码文件加载内存，返回class对象
      1.Class.forName("全类名");
      2.类名.class: 通过类名.属性获取；
      3.对象.getClass();   getClass()方法object中
    */
   public static void main(String[] args) throws  Exception {
       //1
      Class<?> cls1 = Class.forName("Base.FanShe.Person");
      System.out.println(cls1);
      Field name = cls1.getDeclaredField("name");
      System.out.println(name);
      //2
      Class<Person> cls2 = Person.class;
      System.out.println(cls2);
      //3.
      Person person = new Person();
      Class<? extends Person> cls3 = person.getClass();
      System.out.println(cls3); //== 去比较三个对象
      System.out.println(cls1==cls2);
      System.out.println(cls1 == cls3);

   }
}
