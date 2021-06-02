package arrays;

public class Array4 {
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
            if (name.endsWith("a"))
                text += name + ", ";
        }

        System.out.println(text);
    }
}
