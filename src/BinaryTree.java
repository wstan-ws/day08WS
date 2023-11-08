public class BinaryTree {

    private final Node root;

    public BinaryTree(int initValue) {
        root = new Node(initValue);
    }

    public void add(int number) {
        Node curr = root;
        Node toInsert;

        while (true) {
            // If number is already in the Binary Tree
            if (curr.getNumber() == number) {
                return;
            } else if (number < curr.getNumber()) {
                if (curr.hasLeft()) {
                    curr = curr.getLeft();
                } else {
                    toInsert = new Node(number);
                    curr.setLeft(toInsert);
                    return;
                }
            } else {
                if (curr.hasRight()) {
                    curr = curr.getRight();
                } else {
                    toInsert = new Node(number);
                    curr.setRight(toInsert);
                    return;
                }
            }
        }
    }

    public void traverseTreeWithRecursion() {
        traverseTree(root);
    }

    public void traverseTree(Node btNode) {
        // go left
        if (btNode.hasLeft())
            traverseTree(btNode.getLeft());

        // print
        System.out.printf(" %s", btNode.getNumber());

        // go right
        if (btNode.hasRight())
            traverseTree(btNode.getRight());
    }
}