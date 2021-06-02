package loops;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i<3; i++) {
            int number = scanner.nextInt();
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
