package MyThread;

import java.util.ArrayList;
import java.util.List;

public class ThreadExt1 extends Thread {
    @Override
    public void run() {
        super.run();
        List<String> is = new ArrayList<>();
        is.size();
    }
}
