package linkedList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<String> linkedList;

    @BeforeEach
    void setup() {
        linkedList = new LinkedList<>();
    }

    @Test
    void canAddNewItemTest() {
        linkedList.add("John");
        assertEquals(1, linkedList.size());
    }

    @Test
    void canGetHeadTest() {
        linkedList.add("John");
        linkedList.add("Doe");
        linkedList.add("Billy");
        linkedList.add("Cane");
        linkedList.add("Tommy");

        assertEquals("John", linkedList.getHead().toString());
    }

    @Test
    void canInsertAtHeadTest() {
        linkedList.add("John");
        linkedList.add("Doe");
        linkedList.add("Billy");

        linkedList.insertAtHead("Cane");

        assertEquals("Cane", linkedList.getHead().toString());
    }

    @Test
    void canInsertAtEmptyListHeadTest() {
        linkedList.insertAtHead("Cane");

        assertEquals("Cane", linkedList.getHead().toString());
    }

    @Test
    void canInsertAtTailTest() {
        linkedList.add("John");
        linkedList.add("Doe");
        linkedList.add("Billy");

        linkedList.insertAtTail("Cane");

        assertEquals("Cane", linkedList.getTail().toString());
    }

    @Test
    void canInsertAtEmptyListTailTest() {
        linkedList.insertAtTail("Cane");

        assertEquals("Cane", linkedList.getTail().toString());
    }

    @Test
    void testIsEmpty() {
        assertTrue(linkedList.isEmpty());
    }

    @Test
    void testIsNotEmpty() {
        linkedList.add("John");
        linkedList.add("Doe");

        assertFalse(linkedList.isEmpty());
    }

    @Test
    void canConvertListToStringTest() {
        linkedList.add("John");
        linkedList.add("Doe");

        assertEquals("LinkedList{John->Doe}", linkedList.toString());
    }

    @Test
    void canGetAtIndexTest() {
        linkedList.add("John");
        linkedList.add("Doe");
        linkedList.add("Billy");
        linkedList.add("Cane");
        linkedList.add("Tommy");

        assertEquals("Doe", linkedList.get(1).toString());
    }

    @Test
    void canDeleteHeadTest() {
        linkedList.add("John");
        linkedList.add("Doe");
        linkedList.add("Billy");
        linkedList.add("Cane");
        linkedList.add("Tommy");

        linkedList.deleteAtHead();

        assertEquals("Doe", linkedList.getHead().toString());
    }

    @Test
    void canDeleteHeadWithValueTest() {
        linkedList.add("John");
        linkedList.add("Doe");
        linkedList.add("Billy");
        linkedList.add("Cane");
        linkedList.add("Tommy");

        linkedList.delete("John");

        assertEquals("Doe", linkedList.getHead().toString());
    }

    @Test
    void canDeleteTailTest() {
        linkedList.add("John");
        linkedList.add("Doe");
        linkedList.add("Billy");
        linkedList.add("Cane");
        linkedList.add("Tommy");

        assertEquals("Tommy", linkedList.getTail().toString());
        linkedList.deleteAtTail();

        assertEquals("Cane", linkedList.getTail().toString());
    }

    @Test
    void canDeleteTailWithValueTest() {
        linkedList.add("John");
        linkedList.add("Doe");
        linkedList.add("Billy");
        linkedList.add("Cane");
        linkedList.add("Tommy");

        assertEquals("Tommy", linkedList.getTail().toString());
        linkedList.delete("Tommy");

        assertEquals("Cane", linkedList.getTail().toString());
    }

    @Test
    void canDeleteValueTest() {
        linkedList.add("John");
        linkedList.add("Doe");
        linkedList.add("Billy");
        linkedList.add("Cane");
        linkedList.add("Tommy");

        assertEquals("LinkedList{John->Doe->Billy->Cane->Tommy}", linkedList.toString());
        linkedList.delete("Cane");
        assertEquals("LinkedList{John->Doe->Billy->Tommy}", linkedList.toString());
    }

    @Test
    void canSearchListTest() {
        linkedList.add("John");
        linkedList.add("Doe");
        linkedList.add("Billy");
        linkedList.add("Cane");
        linkedList.add("Tommy");

        Node<String> billy = linkedList.search("Billy");
        assertEquals("Billy", billy.toString());
        assertEquals("Cane", billy.next().toString());
    }

    @Test
    void cannotDeleteTailOfEmptyList() {
        linkedList.deleteAtTail();
        assertEquals(0, linkedList.size());
    }
}