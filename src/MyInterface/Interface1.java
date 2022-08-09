package MyInterface;

import java.awt.event.MouseListener;
import java.nio.file.Paths;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author congpeitong
 * @date 2022-08-08 12:31
 */
public interface Interface1 {
     int a = 1;
     int b = 2;
     default int compareTo() {
         return 0;
     }

}
