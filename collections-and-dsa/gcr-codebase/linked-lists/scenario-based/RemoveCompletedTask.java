class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class RemoveCompletedTask {

    public static Node removeTask(Node head, int taskId) {

        if (head == null) {
            return null;
        }

        if (head.data == taskId) {
            return head.next;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.data != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        display(head);

        head = removeTask(head, 3);

        display(head);
    }
}