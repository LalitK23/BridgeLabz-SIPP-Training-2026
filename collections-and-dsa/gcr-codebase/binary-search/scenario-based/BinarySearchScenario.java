import java.util.*;

public class BinarySearchScenario {

    public static int binarySearch(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int searchRotated(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[left] <= arr[mid]) {

                if (target >= arr[left] && target < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {

                if (target > arr[mid] && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static int firstOccurrence(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static int lastOccurrence(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static int findMinimum(int arr[]) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return arr[left];
    }

    public static void main(String[] args) {

        int sorted[] = {10, 20, 30, 40, 50, 60, 70};

        System.out.println("Binary Search Index : " + binarySearch(sorted, 40));

        int rotated[] = {40, 50, 60, 70, 10, 20, 30};

        System.out.println("Search in Rotated Array : " + searchRotated(rotated, 20));

        int repeated[] = {10, 20, 20, 20, 30, 40};

        System.out.println("First Occurrence : " + firstOccurrence(repeated, 20));
        System.out.println("Last Occurrence : " + lastOccurrence(repeated, 20));

        System.out.println("Minimum Element : " + findMinimum(rotated));
    }
}