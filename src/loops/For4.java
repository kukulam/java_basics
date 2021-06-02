package loops;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int squareSize = scanner.nextInt();
        for (int i = 0; i<squareSize; i++) {
            for (int j = 0; j<squareSize; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
