import java.util.*;

public class TripletsLoadBalancing {

    public static void findTriplets(int[] jobs, int target) {

        Arrays.sort(jobs);

        boolean found = false;

        for (int i = 0; i < jobs.length - 2; i++) {

            if (i > 0 && jobs[i] == jobs[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = jobs.length - 1;

            while (left < right) {

                int sum = jobs[i] + jobs[left] + jobs[right];

                if (sum == target) {

                    System.out.println(jobs[i] + " " + jobs[left] + " " + jobs[right]);
                    found = true;

                    while (left < right && jobs[left] == jobs[left + 1]) {
                        left++;
                    }

                    while (left < right && jobs[right] == jobs[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        if (!found) {
            System.out.println("No Triplets Found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] jobs = new int[n];

        for (int i = 0; i < n; i++) {
            jobs[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        findTriplets(jobs, target);

        sc.close();
    }
}