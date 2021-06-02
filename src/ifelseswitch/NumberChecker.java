package ifelseswitch;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Liczba " + a + " jest podzielna parzysta");
        } else {
            System.out.println("Liczba " + a + " nie jest parzysta");
        }

        if (a % b == 0) {
            System.out.println("Liczba " + a + " jest podzielna przez " + b);
        } else {
            System.out.println("Liczba " + a + " nie jest podzielna przez " + b);
        }
    }
}
