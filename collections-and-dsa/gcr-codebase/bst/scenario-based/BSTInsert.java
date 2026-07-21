import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BSTInsert {

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

        BSTInsert tree = new BSTInsert();

        System.out.print("Enter Number of Nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter Node Values:");

        for (int i = 0; i < n; i++) {
            tree.root = tree.insert(tree.root, sc.nextInt());
        }

        System.out.print("Enter New Value to Insert: ");
        int value = sc.nextInt();

        tree.root = tree.insert(tree.root, value);

        System.out.println("BST After Insertion:");

        tree.inorder(tree.root);

        sc.close();
    }
}2