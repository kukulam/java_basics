package ifelseswitch;

import java.util.Scanner;

public class ConditionalStatements1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 10) {
            System.out.println("Liczba jest mniejsza niz 10");
        } else if (number == 10) {
            System.out.println("Liczba jest równa 10");
        } else {
            System.out.println("Liczba jest większa niż 10");
        }
    }
}
