package Base.Base;

/**
 * @author congpeitong
 */
public interface InterfaceSample<T> {

    /**
     * 测试接口中的静态方法
     * @return
     */
    static String getString() {
        return "hello world";
    }

    default int compareTo(T other) {
        return 0;
    }
}
