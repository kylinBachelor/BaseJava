package Base.Base;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/15
 * @describe：Java流的使用
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

        System.out.println(Stream.of(1,2,3,4,5,6,7,8,9)
                        .filter(intss->intss>8)
                        .count());
    }





}
