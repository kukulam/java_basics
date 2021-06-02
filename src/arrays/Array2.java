package arrays;

public class Array2 {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Milosz",
                "Ala",
                "Marek",
                "Jessica",
                "Mateusz"
        };

        String text = "";
        for (String name : array) {
            text += name + ", ";
        }

        System.out.println(text);
    }
}
