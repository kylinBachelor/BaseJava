package Base.Base;

/**
 * @createUser： congpeitong
 * @createTime： 2022/2/15
 * @describe：
 */
public class ConcurrentSampleTest {

    public static void main(String[] args) {
        ConcurrentSample concurrentSample = new ConcurrentSample();
        new Thread(()->{
            for (int i=1;i<10;i++) {
                System.out.println("执行1---> " + i + "\n");
            }
        }).start();
        for (int i=1;i<10;i++) {
            System.out.println("执行2---> " + i + "\n");
        }

        new Thread(()->{
            for (int i=1;i<10;i++) {
                System.out.println("执行3---> " + i + "\n");
            }
        }).start();

        for (int i=1;i<10;i++) {
            System.out.println("执行4---> " + i + "\n");
        }


    }
}
