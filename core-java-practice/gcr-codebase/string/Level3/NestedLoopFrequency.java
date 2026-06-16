import java.util.Scanner;

public class NestedLoopFrequency {

    static String[] frequency(String text) {

        char[] characters = text.toCharArray();

        int[] freq = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {

            freq[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] == characters[j]) {

                    freq[i]++;

                    characters[j] = '0';
                }
            }
        }

        String[] result = new String[characters.length];

        int index = 0;

        for (int i = 0; i < characters.length; i++) {

            if (characters[i] != '0') {

                result[index] = characters[i] + " : " + freq[i];

                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");

        String text = sc.nextLine();

        String[] result = frequency(text);

        for (int i = 0; i < result.length; i++) {

            if (result[i] != null) {

                System.out.println(result[i]);
            }
        }

        sc.close();
    }
}