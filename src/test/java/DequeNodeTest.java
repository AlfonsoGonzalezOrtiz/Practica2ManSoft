import org.example.DequeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeNodeTest {

    private DequeNode<Integer> dnode;


    @Test
    void DequeNodeNull() {
        dnode = new DequeNode<>(null,null,null);
        assertNull(dnode.getItem());
        assertNull(dnode.getPrevious());
        assertNull(dnode.getNext());
        assertFalse(dnode.isNotATerminalNode());
        assertTrue(dnode.isFirstNode());
        assertTrue(dnode.isLastNode());
    }

    @Test
    void DequeNodeItemNotNull() {
        dnode = new DequeNode<>(0,null,null);
        assertEquals(0,dnode.getItem());
        assertNull(dnode.getPrevious());
        assertNull(dnode.getNext());
        assertFalse(dnode.isNotATerminalNode());
        assertTrue(dnode.isFirstNode());
        assertTrue(dnode.isLastNode());
    }

    @Test
    void DequeNodeNextNotNull(){
        DequeNode<Integer> next = new DequeNode<>(1,null,null);
        dnode = new DequeNode<>(0,next,null);
        assertEquals(0,dnode.getItem());
        assertNull(dnode.getPrevious());
        assertEquals(dnode.getNext(),next);
        assertFalse(dnode.isNotATerminalNode());
        assertTrue(dnode.isFirstNode());
        assertFalse(dnode.isLastNode());
    }

    @Test
    void DequeNodePreviousNotNull(){
        DequeNode<Integer> previous = new DequeNode<>(0,null,null);
        dnode = new DequeNode<>(1,null,previous);
        assertEquals(1,dnode.getItem());
        assertEquals(dnode.getPrevious(),previous);
        assertNull(dnode.getNext());
        assertFalse(dnode.isNotATerminalNode());
        assertFalse(dnode.isFirstNode());
        assertTrue(dnode.isLastNode());
    }

    @Test
    void DequeNodePreviousAndNextNotNull(){
        DequeNode<Integer> next = new DequeNode<>(2,null,null);
        DequeNode<Integer> previous = new DequeNode<>(0,null,null);
        dnode = new DequeNode<>(1,next,previous);
        assertEquals(1,dnode.getItem());
        assertEquals(dnode.getPrevious(),previous);
        assertEquals(dnode.getNext(),next);
        assertTrue(dnode.isNotATerminalNode());
        assertFalse(dnode.isFirstNode());
        assertFalse(dnode.isLastNode());
    }

}