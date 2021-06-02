package ifelseswitch;

import java.util.Scanner;

public class Calculator1d {
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
            case "mnozenie": {
                int multiply = a * b;
                System.out.printf("%d * %d = %d\n",a, b, multiply);
                break;
            }
            case "dzielenie": {
                if (b == 0) {
                    System.out.println("Nie można dzielić przez 0 !");
                } else {
                    int division = a / b;
                    System.out.printf("%d / %d = %d\n",a, b, division);
                }
                break;
            }
            default: {
                System.out.println("Nie ma takiej operacji");
                break;
            }
        }
    }
}
