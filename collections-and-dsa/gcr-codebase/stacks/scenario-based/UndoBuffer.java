import java.util.Scanner;

public class UndoBuffer {

    private String[] data;
    private int top;

    UndoBuffer(int maxDepth) {
        data = new String[maxDepth];
        top = -1;
    }

    public boolean push(String edit) {

        if (top == data.length - 1) {
            return false;
        }

        data[++top] = edit;
        return true;
    }

    public String pop() {

        if (isEmpty()) {
            return "Nothing to undo";
        }

        return data[top--];
    }

    public String peek() {

        if (isEmpty()) {
            return "Nothing to undo";
        }

        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Undo Buffer Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UndoBuffer stack = new UndoBuffer(5);

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
                    System.out.print("Enter Edit: ");
                    String edit = sc.nextLine();

                    if (stack.push(edit)) {
                        System.out.println("Added");
                    } else {
                        System.out.println("Undo Buffer Full");
                    }
                    break;

                case 2:
                    System.out.println("Removed: " + stack.pop());
                    break;

                case 3:
                    System.out.println("Top: " + stack.peek());
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