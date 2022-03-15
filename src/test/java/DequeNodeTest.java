import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DequeNodeTest {

    private DequeNode dnode;


    @Test
    public void DequeNodeNull() {
        dnode = new DequeNode(null,null,null);
        assertEquals(dnode.getItem(),null);
        assertEquals(dnode.getPrevious(),null);
        assertEquals(dnode.getNext(),null);
        assertEquals(dnode.isNotATerminalNode(),false);
        assertEquals(dnode.isFirstNode(),true);
        assertEquals(dnode.isLastNode(),true);
    }

    @Test
    public void DequeNodeItemNotNull() {
        dnode = new DequeNode(0,null,null);
        assertEquals(dnode.getItem(),0);
        assertEquals(dnode.getPrevious(),null);
        assertEquals(dnode.getNext(),null);
        assertEquals(dnode.isNotATerminalNode(),false);
        assertEquals(dnode.isFirstNode(),true);
        assertEquals(dnode.isLastNode(),true);
    }

    @Test
    public void DequeNodeNextNotNull(){
        dnode = new DequeNode(0,new DequeNode(1,null,null),null);
        assertEquals(dnode.isNotATerminalNode(),false);
        assertEquals(dnode.isFirstNode(),true);
        assertEquals(dnode.isLastNode(),false);
    }

    @Test
    public void DequeNodePreviousNotNull(){
        dnode = new DequeNode(1,null,new DequeNode(0,null,null));
        assertEquals(dnode.isNotATerminalNode(),false);
        assertEquals(dnode.isFirstNode(),false);
        assertEquals(dnode.isLastNode(),true);
    }

    @Test
    public void DequeNodePreviousAndNextNotNull(){
        dnode = new DequeNode(1,new DequeNode(0,null,null),new DequeNode(2,null,null));
        assertEquals(dnode.isNotATerminalNode(),true);
        assertEquals(dnode.isFirstNode(),false);
        assertEquals(dnode.isLastNode(),false);
    }

}