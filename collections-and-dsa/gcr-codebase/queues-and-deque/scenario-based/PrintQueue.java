import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrintQueue {

    private Deque<Integer> printQueue;

    public PrintQueue() {
        printQueue = new ArrayDeque<>();
    }

    public void addLast(int jobId) {
        printQueue.addLast(jobId);
    }

    public void addFirst(int jobId) {
        printQueue.addFirst(jobId);
    }

    public void removeFirst() {

        if (printQueue.isEmpty()) {
            System.out.println("Print Queue Empty");
            return;
        }

        System.out.println("Printing Job: " + printQueue.removeFirst());
    }

    public void display() {

        if (printQueue.isEmpty()) {
            System.out.println("Print Queue Empty");
            return;
        }

        System.out.println("Print Queue: " + printQueue);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintQueue queue = new PrintQueue();

        while (true) {

            System.out.println("\n1. Add Normal Job");
            System.out.println("2. Add Urgent Job");
            System.out.println("3. Print Next Job");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Job ID: ");
                    int normalJob = sc.nextInt();
                    queue.addLast(normalJob);
                    System.out.println("Normal Job Added");
                    break;

                case 2:
                    System.out.print("Enter Job ID: ");
                    int urgentJob = sc.nextInt();
                    queue.addFirst(urgentJob);
                    System.out.println("Urgent Job Added");
                    break;

                case 3:
                    queue.removeFirst();
                    break;

                case 4:
                    queue.display();
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}