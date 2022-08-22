package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        if (cathetusLength == 0) {
            System.out.print("");
        } else {
            for (int s = 1; s <= cathetusLength; s++) {
                System.out.println("8".repeat(s));
            }
        }
    }
}

