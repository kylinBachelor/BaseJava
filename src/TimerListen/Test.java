package TimerListen;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author congpeitong
 * @date 2022-08-05 12:43
 */
public class Test {
    public static void main(String[] args) {
        ActionListener timePrinter = new TimePrinter();
        Timer timer = new Timer(1000, timePrinter);
        timer.start();
        JOptionPane.showInputDialog("Quit program?");
        System.out.println(""+ timer.toString());
        System.exit(0);
    }
}
