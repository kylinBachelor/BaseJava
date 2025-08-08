package FanXing;


public class Print<T> {
    
    T printValue;

    public Print(T printValue) {
        this.printValue = printValue;
    }

    public void print() {
        System.out.println(printValue);
    }

}