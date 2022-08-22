package school.mjc.stage0.loops.task5;

import static java.lang.Integer.parseInt;

public class Square {
    public void printSquareFrom8s(int sideLength) {
        if (sideLength == 0) {
            System.out.print("");
        } else {
            for (int s = 0; s < sideLength; s++) {
                if (s == 0 | s == sideLength - 1) {
                    System.out.println("8".repeat(sideLength));
                } else {
                    System.out.println(8 + " ".repeat(sideLength - 2) + 8);
                }
            }
        }
    }
}
