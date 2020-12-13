package Base.Lambda;

import java.beans.FeatureDescriptor;
import java.util.Arrays;
import java.util.Comparator;

public class Labmda2 {
    public static void main(String[] args) {
        //使用数组存储多个Person对象
        Person[] arr = {
                new Person("刘岩",38),
                new Person("迪丽热巴",18),
                new Person("古力娜扎",19)
        };
        //对数组中的person 对象使用array的sort方法通过年龄进行升序排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }

        });
        //使用lambda表达式，简化匿名内部类
        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge() - o2.getAge();
        });
        for (Person person : arr) {
            System.out.println(person);

        }
    }
}
