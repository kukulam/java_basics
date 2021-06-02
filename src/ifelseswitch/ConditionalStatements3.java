package ifelseswitch;

import java.util.Scanner;

public class ConditionalStatements3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        if (text.equals("gwiazdka")) {
            System.out.println("*");
        } else if (text.equals("dolar")) {
            System.out.println("$");
        } else {
            System.out.println("inna");
        }
    }
}
