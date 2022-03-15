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
        assertEquals(dnode.getNext(),null);
        assertEquals(dnode.getNext(),null);
    }

    @Test
    public void DequeNodeItemNotNull() {
        dnode = new DequeNode(0,null,null);
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


}