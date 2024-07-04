package Tree;

public class BinaryTree {
    static int ind = -1;

    public Node bulidTree(int nodes[]) {
        ind++;
        if (nodes[ind] == -1) {
            return null;
        }
        Node newNode = new Node(nodes[ind]);
        newNode.left = bulidTree(nodes);
        newNode.right = bulidTree(nodes);
        return newNode;
    }

    // root, Left, Right ⬆️⬅️➡️
    public void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    // Left, Right, root ⬅️➡️⬆️
    public void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);

    }

    // Left, root, Right ⬅️⬆️➡️
    public void inOrder(Node root) {
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int LNC = countNodes(root.left);
        System.out.println("LNC "+ LNC);
        int RNC = countNodes(root.right);
        return LNC + RNC + 1;
    }

    public int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int LNS = sumOfNodes(root.left);
        int RNS = sumOfNodes(root.right);
        return LNS + RNS + root.value;
    }

    public int getHight(Node root) {
        if (root == null) {
            return 0;
        }

        int rightH = getHight(root.right);
        int leftH = getHight(root.left);
        return Math.max(rightH, leftH) + 1;
    }

    public int getDiameter(Node root) {
        if (root == null) {
            return 0;
        }

        int LD = getHight(root.left);
        int RD = getHight(root.right);
        int TD = getHight(root.left) + getHight(root.right) + 1;
        return Math.max(TD, Math.max(RD, LD)) + 1;
    }
}