import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {
    @Test
    void testEmptyList() {
        CircularLinkedList list = new CircularLinkedList();
        assertFalse(list.find(10));
        assertFalse(list.remove(10));
    }

    @Test
    void testAddOneItem() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(10);
        assertTrue(list.find(10));
        assertFalse(list.find(20));
    }
}