package Tree;

public class Node {
    public int data;
    Node right;
    Node left;

    Node(int data) {
        this.data = data;
        this.right = this.left = null;
    }
}
