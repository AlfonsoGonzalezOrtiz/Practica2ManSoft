import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Deque;

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
        DequeNode node = new DequeNode<>(1, null, null);
        list.appendLeft(node);
        assertEquals(node, list.peekFirst());
    }

    @Test
    public void AppendLeftOneNode(){
        DequeNode node1 = new DequeNode<>(1, null, null);
        DequeNode node2 = new DequeNode<>(1, null, null);
        list.appendLeft(node1);
        list.appendLeft(node2);
        assertEquals(node2, list.peekFirst());
        assertEquals(node1, list.peekLast());
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
        list.deleteLast();
        assertNull(list);
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0, list.size());
    }

    @Test
    public void DeleteLastOneNode(){
        DequeNode node = new DequeNode<>(1, null, null);
        list.append(node);
        list.deleteLast();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0, list.size());
    }

    @Test
    public void DeleteLastMultipleNodes(){
        DequeNode node1 = new DequeNode<>(1, null, null);
        DequeNode node2 = new DequeNode<>(1, null, null);
        list.append(node1);
        list.append(node2);
        list.deleteLast();
        assertEquals(node1, list.peekFirst());
        assertEquals(node1, list.peekLast());
        assertEquals(1, list.size());
    }
}
