import java.util.*;

public class PairSumFraudDetection {

    public static int[] findPairSum(int[] transactions, int target) {

        int left = 0;
        int right = transactions.length - 1;

        while (left < right) {

            int sum = transactions[left] + transactions[right];

            if (sum == target) {
                return new int[]{transactions[left], transactions[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] transactions = new int[n];

        for (int i = 0; i < n; i++) {
            transactions[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] result = findPairSum(transactions, target);

        if (result[0] == -1) {
            System.out.println("Pair Not Found");
        } else {
            System.out.println("Pair: " + result[0] + " " + result[1]);
        }

        sc.close();
    }
}