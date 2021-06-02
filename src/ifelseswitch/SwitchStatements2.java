package ifelseswitch;

import java.util.Scanner;

public class SwitchStatements2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number){
            case 0: {
                System.out.println(")");
                break;
            }
            case 1: {
                System.out.println("!");
                break;
            }
            case 2: {
                System.out.println("@");
                break;
            }
            default: {
                System.out.println("inna");
                break;
            }
        }
    }
}
