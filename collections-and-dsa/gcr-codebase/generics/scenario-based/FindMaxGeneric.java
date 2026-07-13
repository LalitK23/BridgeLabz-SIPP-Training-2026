public class FindMaxGeneric {

    public static <T extends Comparable<T>> T findMax(T arr[]) {

        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Integer arr[] = {12, 35, 8, 90, 45};

        System.out.println("Maximum = " + findMax(arr));
    }
}