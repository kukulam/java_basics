package arrays;

import java.util.Random;

public class Array1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        System.out.println("random number");
        for(int i=0; i<10; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nsum");
        int sum = 0;
        for (int i: array) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("average");
        int average = sum/array.length;
        System.out.println(average);

        System.out.println("max");
        int max = array[0];
        for (int i: array) {
            if (i > max)
                max = i;
        }
        System.out.println(max);

        System.out.println("even numbers");
        for (int i: array) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}
