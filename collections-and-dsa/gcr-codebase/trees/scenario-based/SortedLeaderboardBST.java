import java.util.ArrayList;
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

public class SortedLeaderboardBST {

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

    public void inorder(Node node, List<Integer> result) {

        if (node == null) {
            return;
        }

        inorder(node.left, result);
        result.add(node.data);
        inorder(node.right, result);
    }

    public List<Integer> getSortedLeaderboard() {

        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SortedLeaderboardBST tree = new SortedLeaderboardBST();

        System.out.print("Enter Number of Scores: ");
        int n = sc.nextInt();

        System.out.println("Enter Scores:");

        for (int i = 0; i < n; i++) {
            tree.insert(sc.nextInt());
        }

        List<Integer> leaderboard = tree.getSortedLeaderboard();

        System.out.println("Sorted Leaderboard:");

        for (int score : leaderboard) {
            System.out.print(score + " ");
        }

        sc.close();
    }
}