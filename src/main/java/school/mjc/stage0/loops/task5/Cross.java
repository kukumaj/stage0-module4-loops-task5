package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if (sideLength == 0) {
            System.out.print("");
        } else {
            for (int s = 1; s <= sideLength; s++) {
                if (sideLength % s != (sideLength - 1) / 2) {
                    System.out.println(" ".repeat((sideLength - 1) / 2) + 8 + " ".repeat((sideLength - 1) / 2));
                } else {
                    System.out.println("8".repeat(sideLength));
                }
            }
        }
    }
}
