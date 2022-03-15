import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases:
 * factorial 0 -> 1 *
 * factorial 1 -> 1
 * factorial 2 -> 2
 * factorial 3 -> 6
 * factorial 6 -> 720
 */
class DequeNodeTest {

    private DequeNode dnode;


    @Test
    public void DequeNodeNull() {
        dnode = new DequeNode(null,null,null);
        assertEquals(dnode.getItem(),null);
        assertEquals(dnode.getNext(),null);
        assertEquals(dnode.getNext(),null);
    }

}