package JavaSuo.javaCAS;
public class AtomicCousumer extends Thread{
    private AtomicCounter atomicCounter;
    public AtomicCousumer(AtomicCounter atomicCounter) {
        this.atomicCounter = atomicCounter;
    }
    @Override
    public void run() {
        for (int j = 0; j<AtomicTest.LOOP; j++){
            System.out.println("cousumer : " + atomicCounter.getInteger());
            atomicCounter.decrement();
        }

    }
}
