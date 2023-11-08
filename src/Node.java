public class Node {
    
    private Node left;
    private Node right;
    private final int number;

    public Node(int number) {
        this.number = number;
        left = null;
        right = null;
    }

    public boolean hasLeft() {
        return null != left;
    }

    public boolean hasRight() {
        return null != right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getNumber() {
        return number;
    }    
}