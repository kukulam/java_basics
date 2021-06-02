package loops;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<3; i++) {
            String product = scanner.next();
            System.out.println("Dodałem do koszyka: " + product + ", to nasz produkt!");
        }
    }
}
