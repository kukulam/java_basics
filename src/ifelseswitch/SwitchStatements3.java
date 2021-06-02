package ifelseswitch;

import java.util.Scanner;

public class SwitchStatements3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        switch (text){
            case "gwiazdka": {
                System.out.println("*");
                break;
            }
            case "dolar": {
                System.out.println("$");
                break;
            }
            default: {
                System.out.println("inna");
                break;
            }
        }
    }
}
