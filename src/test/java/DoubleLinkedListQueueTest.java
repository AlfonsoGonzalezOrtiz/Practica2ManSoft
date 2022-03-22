import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class DoubleLinkedListQueueTest {

    private DoubleLinkedListQueue list;

    @BeforeEach
    public void init(){
        list = new DoubleLinkedListQueue<>();
    }

    @Test
    public void PeekFirstNodeless() {
        assertNull(list.peekFirst());
    }

    @Test
    public void PeekLastNodeless(){
        assertNull(list.peekLast());
    }

    @Test
    public void SizeNodeless(){
        assertEquals(0,list.size());
    }


    @Test
    public void AppendNodeless(){
        DequeNode node = new DequeNode(1,null,null);
        list.append(node);
        assertEquals(node,list.peekFirst());
        assertEquals(node,list.peekLast());
        assertEquals(1,list.size());
    }

    @Test
    public void AppendOneNode(){
        DequeNode node = new DequeNode(1,null,null);
        DequeNode node2 = new DequeNode(2,null,null);
        list.append(node);
        list.append(node2);
        assertEquals(node,list.peekFirst());
        assertEquals(node,list.peekLast());
        assertEquals(2,list.size());
    }

    @Test
    public void AppendLeftNodeless(){

    }

    @Test
    public void AppendLeftOneNode(){

    }


    @Test
    public void DeleteFirstNodeless(){
        list.deleteFirst();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0,list.size());
    }

    @Test
    public void DeleteFirstOneNode(){
        DequeNode node = new DequeNode(1,null,null);
        list.append(node);
        list.deleteFirst();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0,list.size());
    }

    @Test
    public void DeleteFirstMultipleNodes(){
        DequeNode node = new DequeNode(1,null,null);
        DequeNode node2 = new DequeNode(2,null,null);
        list.append(node);
        list.append(node2);
        list.deleteFirst();
        assertEquals(node2,list.peekFirst());
        assertEquals(node2,list.peekLast());
        assertEquals(1,list.size());
    }

    @Test
    public void DeleteLastNodeless(){

    }

    @Test
    public void DeleteLastOneNode(){

    }

}
