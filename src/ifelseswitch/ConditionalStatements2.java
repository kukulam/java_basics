package ifelseswitch;

import java.util.Scanner;

public class ConditionalStatements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println(")");
        } else if (number == 1) {
            System.out.println("!");
        } else if (number == 2) {
            System.out.println("@");
        } else if (number == 3) {
            System.out.println("#");
        } else {
            System.out.println("inna");
        }
    }
}
