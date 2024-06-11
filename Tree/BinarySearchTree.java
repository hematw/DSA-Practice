package Tree;

public class BinarySearchTree extends BinaryTree {
    public Node root;

    public BinarySearchTree(int value) {
        Node newNode = new Node(value);
        root = newNode;
    }

    public BinarySearchTree() {
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
        }

        Node temp = root;

        if (temp.value == newNode.value) {
            return false;
        }

        while (true) {
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                } else {
                    temp = temp.left;
                }
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                } else {
                    temp = temp.right;
                }
            }
        }
    }

    public boolean contains(int value) {
        Node temp = root;

        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }
}
