import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class IterativePreorderTraversal {

    Node root;

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {

        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public List<Integer> preorder(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node current = stack.pop();
            result.add(current.data);

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IterativePreorderTraversal tree = new IterativePreorderTraversal();

        System.out.print("Enter Number of Nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter Node Values:");

        for (int i = 0; i < n; i++) {
            tree.insert(sc.nextInt());
        }

        List<Integer> result = tree.preorder(tree.root);

        System.out.println("Preorder Traversal:");

        for (int value : result) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}