import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FraudPairDetection {

    public static int[] findFraudPair(int[] amounts, int target) {

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < amounts.length; i++) {

            int complement = target - amounts[i];

            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }

            seen.put(amounts[i], i);
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Transactions: ");
        int n = sc.nextInt();

        int[] amounts = new int[n];

        System.out.println("Enter Transaction Amounts:");

        for (int i = 0; i < n; i++) {
            amounts[i] = sc.nextInt();
        }

        System.out.print("Enter Target Amount: ");
        int target = sc.nextInt();

        int[] result = findFraudPair(amounts, target);

        if (result[0] == -1) {
            System.out.println("No Pair Found");
        } else {
            System.out.println("Indices: " + result[0] + " " + result[1]);
        }

        sc.close();
    }
}