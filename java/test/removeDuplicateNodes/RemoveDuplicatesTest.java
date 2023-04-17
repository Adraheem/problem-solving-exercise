package removeDuplicateNodes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    private LinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new LinkedList<>();
    }

    @Test
    void remove() {
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(8);
        list.add(8);
        list.add(8);


        assertEquals(List.of(2, 3, 8), RemoveDuplicates.remove(list));
    }
}