public class Node {
    int value;
    Node next;

    // Regular node
    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    // Dummy node
    public Node() {
        this.next = null;
    }
}
