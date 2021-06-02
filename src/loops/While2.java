package loops;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long timeBeforeLoop = System.currentTimeMillis();
        int sum = 0;
        while((System.currentTimeMillis() - timeBeforeLoop) < (10*1000)) {
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println(sum);
    }
}
