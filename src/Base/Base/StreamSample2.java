package Base.Base;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/16
 * @describe：
 */
public class StreamSample2 {

    public static void main(String[] args) {
        // filter map flatMap方法
        List<Person> people = Arrays.asList(new Person("1", "1", "1"),
                new Person("2", "2", "2"),
                new Person("3", "3", "3"),
                new Person("4", "4", "4"),
                new Person("5", "5", "5"),
                new Person("6", "6", "6"),
                new Person("7", "7", "7"));

        int[] ints = {1,2,3,4,5,6,7,8,9};
        String[] strings = {"1111111","222222222","3333333333","44444","55555555555555555","66666666","777777777","88888888"};
        List<String> stringList = Arrays.asList("1111111","222222222","3333333333","44444","55555555555555555","66666666","777777777","88888888");
        long count = stringList.stream().filter(str -> str.length() > 9)
                .count();
        System.out.println("过滤-->" + count);
        List<String> mapList = Arrays.asList("11AAA11111","22A2222222","333AAA3333333","44444","555555EE55555555555","666EE66666","77777777EE7","88888UU888");
        List<String> collect = mapList.stream().map(mapStr->mapStr.substring(0,1)).collect(Collectors.toList());
        System.out.println(collect);





    }


}
