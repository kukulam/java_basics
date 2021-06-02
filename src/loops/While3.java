package loops;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long timeBeforeLoop = System.currentTimeMillis();
        int sum = 0;
        while((System.currentTimeMillis() - timeBeforeLoop) < (10*1000)) {
            int number = scanner.nextInt();
            if (number > 10)
                sum += number;
        }
        System.out.println(sum);
    }
}
