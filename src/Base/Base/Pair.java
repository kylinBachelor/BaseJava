package Base.Base;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/15
 * @describe：
 */
public class Pair<T> {
    private T first;
    private T second;

    // 泛型方法
    public static <T> T getMiddle(T... middle) {
        System.out.println("泛型方法 " + middle[middle.length/2]);
        return middle[middle.length/2];
    }
    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public Pair() {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
