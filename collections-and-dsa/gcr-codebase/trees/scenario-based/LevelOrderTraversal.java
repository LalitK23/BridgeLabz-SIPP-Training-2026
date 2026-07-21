import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class LevelOrderTraversal {

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

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                Node current = queue.poll();
                level.add(current.data);

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }

            result.add(level);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LevelOrderTraversal tree = new LevelOrderTraversal();

        System.out.print("Enter Number of Nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter Node Values:");

        for (int i = 0; i < n; i++) {
            tree.insert(sc.nextInt());
        }

        List<List<Integer>> result = tree.levelOrder(tree.root);

        System.out.println("Level Order Traversal:");

        for (List<Integer> level : result) {
            for (int value : level) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}