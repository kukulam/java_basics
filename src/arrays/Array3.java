package arrays;

public class Array3 {
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
            if (name.length() < 5)
                text += name + ", ";
        }

        System.out.println(text);
    }
}
