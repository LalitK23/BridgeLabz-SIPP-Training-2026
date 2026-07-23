import java.util.Scanner;

public class ReverseString {

    public static String reverse(String text) {

        if (text.isEmpty()) {
            return "";
        }

        return reverse(text.substring(1)) + text.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");

        String text = sc.nextLine();

        System.out.println(reverse(text));

        sc.close();
    }
}