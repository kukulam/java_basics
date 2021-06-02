package datatypes;

import java.util.Scanner;

public class Variables6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Witaj, " + name + ", masz " + age + " lat");
    }
}
