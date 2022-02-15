package Base.Base;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class connectionTest {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] ts = Arrays.copyOf(a, a.length);
        System.out.println(a);
        System.out.println(ts);
        int[] ints = Arrays.copyOfRange(a, 0, 2);

        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);
        ExtendsSample extendsSample = new ExtendsSample();
        String address = extendsSample.getName();
        System.out.println(address);
        System.out.println(address.hashCode());

        ArrayList<Person> people = new ArrayList<>();
        people.toArray();

//        EnumSample[] values = EnumSample.values();
//        for (EnumSample value : values) {
//            System.out.println(value);
//        }

        //System.out.println(EnumSample.LARGE);
        EnumSample large = Enum.valueOf(EnumSample.class, "LARGE");
        System.out.println(large.getAbbrevation());

        InterfaceImplSample interfaceImplSample = new InterfaceImplSample();
        String string = InterfaceSample.getString();
        System.out.println(string);

        // 测试泛型
        Pair<String> stringPair = new Pair<>();
        stringPair.setFirst("First");
        stringPair.setSecond("Second");
        System.out.println(stringPair.toString());

        // 测试泛型方法 以下两种情况都可，编译器可通过入参判断类型
        Pair.<String>getMiddle("cong","peitong","tong");
        Pair.getMiddle("cong","peitong","tong");

    }
}
