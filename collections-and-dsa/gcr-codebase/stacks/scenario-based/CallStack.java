import java.util.Scanner;

class Node {
    String functionName;
    Node next;

    Node(String functionName) {
        this.functionName = functionName;
        this.next = null;
    }
}

public class CallStack {

    private Node top;

    public CallStack() {
        top = null;
    }

    public void push(String functionName) {

        Node newNode = new Node(functionName);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {

        if (isEmpty()) {
            return "No active call";
        }

        String name = top.functionName;
        top = top.next;
        return name;
    }

    public String peek() {

        if (isEmpty()) {
            return "No active call";
        }

        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Call Stack Empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.println(temp.functionName);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CallStack stack = new CallStack();

        while (true) {

            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Function Name: ");
                    String name = sc.nextLine();
                    stack.push(name);
                    System.out.println("Function Added");
                    break;

                case 2:
                    System.out.println("Returned From: " + stack.pop());
                    break;

                case 3:
                    System.out.println("Current Function: " + stack.peek());
                    break;

                case 4:
                    stack.display();
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