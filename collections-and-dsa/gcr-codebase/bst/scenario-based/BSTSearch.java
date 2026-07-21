import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BSTSearch {

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
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public boolean search(int target) {

        Node current = root;

        while (current != null) {

            if (target == current.data) {
                return true;
            }

            if (target < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BSTSearch tree = new BSTSearch();

        System.out.print("Enter Number of Nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter Node Values:");

        for (int i = 0; i < n; i++) {
            tree.insert(sc.nextInt());
        }

        System.out.print("Enter Value to Search: ");
        int target = sc.nextInt();

        if (tree.search(target)) {
            System.out.println("Value Found");
        } else {
            System.out.println("Value Not Found");
        }

        sc.close();
    }
}