package Base.Base;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * @createUser： congpeitong
 * @createTime： 2022/2/15
 * @describe：Java流的使    用
 */
public class StreamSample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("1", "1", "1"),
                new Person("2", "2", "2"),
                new Person("3", "3", "3"),
                new Person("4", "4", "4"),
                new Person("5", "5", "5"),
                new Person("6", "6", "6"),
                new Person("7", "7", "7"));
        long count = people.stream().filter(p -> Integer.valueOf(p.getAge()) > 3)
                .count();
        System.out.println(count);
        int[] ints = {1,2,3,4,5,6,7,8,9};

        // Collection接口的Stream方法可以将任何一个集合转换为一个流。如果有一个是数组，那么可以使用静态的Stream.of方法
        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9)
                        .limit(8)
                        .collect(Collectors.toList()));
//                        .filter(intss->intss>8)
//                        .count());
        System.out.println(Stream.of(ints,0,3)
                        .filter(in -> in.equals("2"))
                .count());



    }







}
