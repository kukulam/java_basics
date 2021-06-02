package ifelseswitch;

import java.util.Scanner;

public class SwitchStatements1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
            case 10: {
                System.out.println("Liczba to 10");
                break;
            }
            case 100: {
                System.out.println("Liczba to 100");
                break;
            }
            default: {
                System.out.println("Liczba jest różna od 10 i 100");
                break;
            }
        }
    }
}
