import java.util.*;

public class InsertionSortEmployeeIds {

    public static void insertionSort(int ids[]) {

        for (int i = 1; i < ids.length; i++) {

            int current = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > current) {

                ids[j + 1] = ids[j];
                j--;
            }

            ids[j + 1] = current;
        }
    }

    public static void printArray(int ids[]) {

        for (int i = 0; i < ids.length; i++) {
            System.out.print(ids[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int ids[] = {105, 101, 104, 102, 103};

        System.out.println("Before Sorting:");
        printArray(ids);

        insertionSort(ids);

        System.out.println("After Sorting:");
        printArray(ids);
    }
}