import java.util.*;

public class BubbleSortStudentMarks {

    public static void bubbleSort(int marks[]) {

        for (int i = 0; i < marks.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < marks.length - 1 - i; j++) {

                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int marks[]) {

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int marks[] = {78, 45, 90, 62, 55};

        System.out.println("Before Sorting:");
        printArray(marks);

        bubbleSort(marks);

        System.out.println("After Sorting:");
        printArray(marks);
    }
}