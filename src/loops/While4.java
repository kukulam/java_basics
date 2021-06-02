package loops;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";
        while(!text.equals("koniec")) {
            text = scanner.next();
            System.out.println(text);
        }
    }
}
