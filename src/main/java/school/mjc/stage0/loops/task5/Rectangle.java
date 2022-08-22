package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        if (length == 0 | height ==0) {
            System.out.print("");
        } else {
            for (int s = 0; s < height; s++) {
                if (s == 0 | s == height - 1) {
                    System.out.println("8".repeat(length));
                } else {
                    System.out.println(8 + " ".repeat(length - 2) + 8);
                }
            }
        }

    }
}
