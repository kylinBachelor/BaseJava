package MyInterface;

/**
 * @author congpeitong
 * @date 2022-08-08 12:25
 */
public class test {
    public static void main(String[] args) {
        ComparableImpl comparable = new ComparableImpl();
        comparable.compareTo(comparable);
        System.out.println("hello world");
        Interface2.staticMethod();
    }
}
