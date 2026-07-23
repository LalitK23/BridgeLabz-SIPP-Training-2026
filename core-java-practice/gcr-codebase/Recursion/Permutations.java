import java.util.Scanner;

public class Permutations {

    public static void permutations(String text, String answer) {

        if (text.length() == 0) {

            System.out.println(answer);

            return;
        }

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            String remaining = text.substring(0, i) + text.substring(i + 1);

            permutations(remaining, answer + ch);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");

        String text = sc.nextLine();

        permutations(text, "");

        sc.close();
    }
}