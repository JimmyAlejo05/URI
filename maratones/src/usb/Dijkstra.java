
package usb;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Dijkstra {
    public static void main(String[] args) {
        List<String> camino = new ArrayList<>();
        Scanner l = new Scanner(System.in);
        String c;
        boolean controlador = true;
        do {
            c = l.next();
            if (c.contains("(") || c.contains(")")) {
                if (!camino.isEmpty()) {
                    for (int i = 0; i < camino.size(); i++) {
                        if (c.equals(camino.get(i))) {
                            controlador = true;
                            break;
                        }
                    }
                } else {
                    camino.add(c);
                }
                if (!controlador) {
                    camino.add(c);
                }
            } 
            controlador = false;
        } while (!c.contains("(") || !c.contains(")"));
        System.out.println(camino.size());
    }
}
    