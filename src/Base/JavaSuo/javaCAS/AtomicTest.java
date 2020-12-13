package Base.JavaSuo.javaCAS;

public class AtomicTest {
    final static int    LOOP = 1000;

    public static void main(String[] args) throws InterruptedException {
        AtomicCounter counter = new AtomicCounter();
        AtomicProducer producer = new AtomicProducer(counter);
        AtomicCousumer cousumer = new AtomicCousumer(counter);
        producer.start();
        cousumer.start();
        producer.join();
        cousumer.join();
        System.out.println(counter.getInteger());
    }
}
