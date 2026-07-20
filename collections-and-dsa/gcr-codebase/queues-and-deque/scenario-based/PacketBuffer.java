import java.util.Scanner;

public class PacketBuffer {

    private int[] data;
    private int front;
    private int count;

    public PacketBuffer(int capacity) {
        data = new int[capacity];
        front = 0;
        count = 0;
    }

    public boolean enqueue(int packetId) {

        if (count == data.length) {
            return false;
        }

        int rear = (front + count) % data.length;
        data[rear] = packetId;
        count++;
        return true;
    }

    public int dequeue() {

        if (count == 0) {
            return -1;
        }

        int value = data[front];
        front = (front + 1) % data.length;
        count--;
        return value;
    }

    public void display() {

        if (count == 0) {
            System.out.println("Buffer Empty");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Buffer Capacity: ");
        int capacity = sc.nextInt();

        PacketBuffer queue = new PacketBuffer(capacity);

        while (true) {

            System.out.println("\n1. Enqueue Packet");
            System.out.println("2. Dequeue Packet");
            System.out.println("3. Display Buffer");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Packet ID: ");
                    int id = sc.nextInt();

                    if (queue.enqueue(id)) {
                        System.out.println("Packet Added");
                    } else {
                        System.out.println("Buffer Full");
                    }
                    break;

                case 2:
                    int removed = queue.dequeue();

                    if (removed == -1) {
                        System.out.println("Buffer Empty");
                    } else {
                        System.out.println("Processed Packet: " + removed);
                    }
                    break;

                case 3:
                    queue.display();
                    break;

                case 4:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}