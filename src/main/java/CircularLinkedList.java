public class CircularLinkedList {
    private Node dummy;

    public CircularLinkedList() {
        dummy = new Node();
        dummy.next = dummy;
    }

    public void addItem(int value) {
        Node newNode = new Node(value);

        Node current = dummy;

        while(current.next != dummy) {
            current = current.next;
        }

        newNode.next = dummy;
        current.next = newNode;
    }
}
