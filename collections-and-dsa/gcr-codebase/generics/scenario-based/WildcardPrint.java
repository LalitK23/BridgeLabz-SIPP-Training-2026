import java.util.*;

public class WildcardPrint {

    public static void printList(List<?> list) {

        for (Object value : list) {
            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Rahul");
        names.add("Karan");

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        printList(names);
        printList(numbers);
    }
}