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

    @Test
    void testAddMultipleItems() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(1);
        list.addItem(2);
        list.addItem(3);
        list.addItem(4);

        assertTrue(list.find(1));
        assertTrue(list.find(2));
        assertTrue(list.find(3));
        assertTrue(list.find(4));
        assertFalse(list.find(5));

    }

    @Test
    void testRemoveItem() {
        CircularLinkedList list = new CircularLinkedList();
        list.addItem(1);
        list.addItem(2);
        list.addItem(3);
        list.addItem(4);

        assertTrue(list.remove(3));

        assertFalse(list.find(3));
        assertTrue(list.find(1));
        assertTrue(list.find(2));
        assertTrue(list.find(4));
    }

    @Test
    void testRemoveFirstItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(1);
        list.addItem(2);
        list.addItem(3);

        assertTrue(list.remove(1));

        assertFalse(list.find(1));
        assertTrue(list.find(2));
        assertTrue(list.find(3));
    }

    @Test
    void testRemoveLastItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(1);
        list.addItem(2);
        list.addItem(3);

        assertTrue(list.remove(3));

        assertFalse(list.find(3));
        assertTrue(list.find(1));
        assertTrue(list.find(2));
    }

    @Test
    void testRemoveOnlyItem() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(10);

        assertTrue(list.remove(10));
        assertFalse(list.find(10));
    }

    @Test
    void testRemoveItemNotInList() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(1);
        list.addItem(2);
        list.addItem(3);

        assertFalse(list.remove(4));

        assertTrue(list.find(1));
        assertTrue(list.find(2));
        assertTrue(list.find(3));
    }

    @Test
    void testRemoveEverything() {
        CircularLinkedList list = new CircularLinkedList();

        list.addItem(1);
        list.addItem(2);
        list.addItem(3);
        list.addItem(4);

        assertTrue(list.remove(1));
        assertTrue(list.remove(2));
        assertTrue(list.remove(3));
        assertTrue(list.remove(4));

        assertFalse(list.find(1));
        assertFalse(list.find(2));
        assertFalse(list.find(3));
        assertFalse(list.find(4));

    }

    @Test
    void testLongSequence() {
        CircularLinkedList list = new CircularLinkedList();
        // Add 100
        for (int i = 0; i < 100; i++) {
            list.addItem(i);
        }
        // remove 50
        for (int i = 0; i < 50; i++) {
            assertTrue(list.remove(i));
        }
        // First 50 gone
        for (int i = 0; i < 50; i++) {
            assertFalse(list.find(i));
        }
        // Last 50 there
        for (int i = 50; i < 100; i++) {
            assertTrue(list.find(i));
        }
        // Remove all
        for (int i = 50; i < 100; i++) {
            assertTrue(list.remove(i));
        }
        // All gone
        for (int i = 0; i < 100; i++) {
            assertFalse(list.find(i));
        }
    }
}
