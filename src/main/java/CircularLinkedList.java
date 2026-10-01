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

    public void showList() {
        Node current = dummy.next;
        while(current != dummy) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean find(int value) {
        Node current = dummy.next;
        while(current != dummy) {
            if(current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean remove(int value) {
        Node previous = dummy;
        Node current = dummy.next;
        while(current != dummy) {
            if(current.value == value) {
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }

    public void showReverseList() {
        showReverseListRecursive(dummy.next);
        System.out.println();
    }

    public void showReverseListRecursive(Node current) {
        if(current == dummy) {
            return;
        }
        showReverseListRecursive(current.next);
        System.out.print(current.value + " ");
    }
}
