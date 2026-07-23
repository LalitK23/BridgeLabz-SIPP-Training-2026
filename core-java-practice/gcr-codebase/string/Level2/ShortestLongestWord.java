import java.util.Scanner;

public class ShortestLongestWord {

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

    static int[] findShortestLongest(String[] words) {

        int shortest = 0;

        int longest = 0;

        for (int i = 1; i < words.length; i++) {

            if (findLength(words[i]) < findLength(words[shortest])) {

                shortest = i;
            }

            if (findLength(words[i]) > findLength(words[longest])) {

                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");

        String text = sc.nextLine();

        String[] words = splitWords(text);

        int[] result = findShortestLongest(words);

        System.out.println("Shortest word: " + words[result[0]]);

        System.out.println("Longest word: " + words[result[1]]);

        sc.close();
    }
}