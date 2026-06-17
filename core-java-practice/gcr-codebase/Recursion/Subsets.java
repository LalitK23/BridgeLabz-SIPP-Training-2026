import java.util.Scanner;

public class Subsets {

    public static void subsets(int[] arr, int index, String current) {

        if (index == arr.length) {

            System.out.println("[" + current + "]");

            return;
        }

        subsets(arr, index + 1, current);

        if (current.equals("")) {

            subsets(arr, index + 1, current + arr[index]);

        } else {

            subsets(arr, index + 1, current + "," + arr[index]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        subsets(arr, 0, "");

        sc.close();
    }
}