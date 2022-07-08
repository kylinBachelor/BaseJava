package FanShe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获取字节码文件class对象的三种方式
public class ReflectDemo1 {
   /* *
      获取字节码问价class对象的三种方式：将字节码文件加载内存，返回class对象
         1.Class.forName("全类名")
         2.类名.class: 通过类名.属性获取
         3.对象.getClass();   getClass()方法object中
    */
   public static void main(String[] args) throws  Exception {
       //1. Class.forName("全类名")
      Class<?> cls1 = Class.forName("FanShe.Person");
      Method[] methods = cls1.getMethods();
      System.out.println(cls1);
      Field name = cls1.getDeclaredField("name");
      System.out.println("全类名: " + name);
      //2. 类名.class: 通过 类名.属性 获取
      Class<Person> cls2 = Person.class;
      System.out.println("类名.属性: " + cls2);
      //3. 对象.getClass();  getClass()方法object中
      Person person = new Person();
      Class<? extends Person> cls3 = person.getClass();
      System.out.println("对象.getClass: " + cls3);
      //== 去比较三个对象
      System.out.println(cls1==cls2);
      System.out.println(cls1 == cls3);

   }
}
