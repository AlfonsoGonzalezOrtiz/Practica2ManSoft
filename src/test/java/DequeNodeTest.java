import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeNodeTest {

    private DequeNode<Integer> dnode;


    @Test
    public void DequeNodeNull() {
        dnode = new DequeNode<>(null,null,null);
        assertNull(dnode.getItem());
        assertNull(dnode.getPrevious());
        assertNull(dnode.getNext());
        assertFalse(dnode.isNotATerminalNode());
        assertTrue(dnode.isFirstNode());
        assertTrue(dnode.isLastNode());
    }

    @Test
    public void DequeNodeItemNotNull() {
        dnode = new DequeNode<>(0,null,null);
        assertEquals(dnode.getItem(),0);
        assertNull(dnode.getPrevious());
        assertNull(dnode.getNext());
        assertFalse(dnode.isNotATerminalNode());
        assertTrue(dnode.isFirstNode());
        assertTrue(dnode.isLastNode());
    }

    @Test
    public void DequeNodeNextNotNull(){
        DequeNode<Integer> next = new DequeNode<>(1,null,null);
        dnode = new DequeNode<>(0,next,null);
        assertEquals(dnode.getItem(),0);
        assertNull(dnode.getPrevious());
        assertEquals(dnode.getNext(),next);
        assertFalse(dnode.isNotATerminalNode());
        assertTrue(dnode.isFirstNode());
        assertFalse(dnode.isLastNode());
    }

    @Test
    public void DequeNodePreviousNotNull(){
        DequeNode<Integer> previous = new DequeNode<>(0,null,null);
        dnode = new DequeNode<>(1,null,previous);
        assertEquals(dnode.getItem(),1);
        assertEquals(dnode.getPrevious(),previous);
        assertNull(dnode.getNext());
        assertFalse(dnode.isNotATerminalNode());
        assertFalse(dnode.isFirstNode());
        assertTrue(dnode.isLastNode());
    }

    @Test
    public void DequeNodePreviousAndNextNotNull(){
        DequeNode<Integer> next = new DequeNode<>(2,null,null);
        DequeNode<Integer> previous = new DequeNode<>(0,null,null);
        dnode = new DequeNode<>(1,next,previous);
        assertEquals(dnode.getItem(),1);
        assertEquals(dnode.getPrevious(),previous);
        assertEquals(dnode.getNext(),next);
        assertTrue(dnode.isNotATerminalNode());
        assertFalse(dnode.isFirstNode());
        assertFalse(dnode.isLastNode());
    }

}