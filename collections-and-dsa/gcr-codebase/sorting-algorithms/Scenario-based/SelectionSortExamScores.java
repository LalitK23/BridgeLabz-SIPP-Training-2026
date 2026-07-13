import java.util.*;

public class SelectionSortExamScores {

    public static void selectionSort(int scores[]) {

        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < scores.length; j++) {

                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    public static void printArray(int scores[]) {

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int scores[] = {76, 95, 62, 88, 70};

        System.out.println("Before Sorting:");
        printArray(scores);

        selectionSort(scores);

        System.out.println("After Sorting:");
        printArray(scores);
    }
}