package loops;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long timeBeforeLoop = System.currentTimeMillis();
        while((System.currentTimeMillis() - timeBeforeLoop) < (10*1000)) {
            String product = scanner.next();
            System.out.println("Dodałem do koszyka: " + product + ", to nasz produkt!");
        }
    }
}
