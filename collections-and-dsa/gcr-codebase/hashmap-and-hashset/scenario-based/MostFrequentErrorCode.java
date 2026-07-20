import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentErrorCode {

    public static int mostFrequentErrorCode(int[] codes) {

        Map<Integer, Integer> freq = new HashMap<>();

        int bestCode = codes[0];
        int bestCount = 0;

        for (int code : codes) {

            int count = freq.getOrDefault(code, 0) + 1;
            freq.put(code, count);

            if (count > bestCount) {
                bestCount = count;
                bestCode = code;
            }
        }

        return bestCode;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Error Codes: ");
        int n = sc.nextInt();

        int[] codes = new int[n];

        System.out.println("Enter Error Codes:");

        for (int i = 0; i < n; i++) {
            codes[i] = sc.nextInt();
        }

        System.out.println("Most Frequent Error Code: " + mostFrequentErrorCode(codes));

        sc.close();
    }
}