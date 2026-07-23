import java.util.Scanner;

public class WordLengthTable {

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

    static int findLength(String text) {

        int count = 0;

        while (true) {

            try {

                text.charAt(count);

                count++;

            } catch (Exception e) {

                break;
            }
        }

        return count;
    }

    static String[][] createTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            table[i][0] = words[i];

            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");

        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = createTable(words);

        System.out.println("Word\tLength");

        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }

        sc.close();
    }
}