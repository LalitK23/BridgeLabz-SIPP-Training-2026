import java.util.Scanner;

public class SplitText {

    static String[] splitWords(String text) {

        int words = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words++;
            }
        }

        String[] result = new String[words];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= text.length(); i++) {

            if (i == text.length() || text.charAt(i) == ' ') {

                result[index] = text.substring(start, i);

                index++;

                start = i + 1;
            }
        }

        return result;
    }

    static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {

            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");

        String text = sc.nextLine();

        String[] custom = splitWords(text);

        String[] builtIn = text.split(" ");

        boolean result = compareArrays(custom, builtIn);

        System.out.println("Arrays are same: " + result);

        sc.close();
    }
}