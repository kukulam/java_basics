package ifelseswitch;

import java.util.Scanner;

public class Calculator1a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int diff = a - b;
        int summ = a + b;
        System.out.printf("%d + %d = %d\n", a, b, summ);
        System.out.printf("%d - %d = %d\n",a, b, diff);
    }
}
