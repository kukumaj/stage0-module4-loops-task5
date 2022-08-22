package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height == 0){
            System.out.print("");
        } else if (height %2 !=0) {

        for (int i = 0; i <= (height -1)/2 ; i++) {
            System.out.println(" ".repeat(i)+"8".repeat(height-2*i)+" ".repeat(i));
        }
        for (int i = (height +1)/2; i < height ; i++) {
            System.out.println(" ".repeat(height-(i+1))+"8".repeat(1+2*(i-(height-1)/2))+" ".repeat(height-(i+1)));
        }
        }else {
            for (int i = 0; i <= (height/2) -2; i++) {
                System.out.println(" ".repeat(i)+"8".repeat(height-2*i)+" ".repeat(i));
            }
            for (int i = (height/2) -1; i <= height/2; i++) {
                System.out.println(" ".repeat((height-2)/2)+"8".repeat(2)+" ".repeat((height-2)/2));
            }
            for (int i = (height/2)+1; i < height ; i++) {
                System.out.println(" ".repeat(height-(i+1))+"8".repeat(2*(i-(height-1)/2))+" ".repeat(height-(i+1)));
            }

        }

    }
}



