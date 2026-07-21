import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BSTDelete {

    Node root;

    public Node insert(Node node, int data) {

        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    public Node delete(Node node, int value) {

        if (node == null) {
            return null;
        }

        if (value < node.data) {
            node.left = delete(node.left, value);
        } else if (value > node.data) {
            node.right = delete(node.right, value);
        } else {

            if (node.left == null && node.right == null) {
                return null;
            }

            if (node.left == null) {
                return node.right;
            }

            if (node.right == null) {
                return node.left;
            }

            Node successor = findMin(node.right);

            node.data = successor.data;

            node.right = delete(node.right, successor.data);
        }

        return node;
    }

    public Node findMin(Node node) {

        while (node.left != null) {
            node = node.left;
        }

        return node;
    }

    public void inorder(Node node) {

        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BSTDelete tree = new BSTDelete();

        System.out.print("Enter Number of Nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter Node Values:");

        for (int i = 0; i < n; i++) {
            tree.root = tree.insert(tree.root, sc.nextInt());
        }

        System.out.print("Enter Value to Delete: ");
        int value = sc.nextInt();

        tree.root = tree.delete(tree.root, value);

        System.out.println("BST After Deletion:");

        tree.inorder(tree.root);

        sc.close();
    }
}