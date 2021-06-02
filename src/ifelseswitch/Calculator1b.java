package ifelseswitch;

import java.util.Scanner;

public class Calculator1b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operation = scanner.next();
        switch (operation) {
            case "suma": {
                int summ = a + b;
                System.out.printf("%d + %d = %d\n", a, b, summ);
                break;
            }
            case "roznica": {
                int diff = a - b;
                System.out.printf("%d - %d = %d\n",a, b, diff);
                break;
            }
            default: {
                System.out.println("Nie ma takiej operacji");
                break;
            }
        }
    }
}
