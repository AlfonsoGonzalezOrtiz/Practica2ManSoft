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
    public void AppendOneNode(){
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        list.append(node);
        assertEquals(node,list.peekFirst());
        assertEquals(node,list.peekLast());
        assertEquals(1,list.size());
    }

    @Test
    public void AppendTwoNodes(){
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        list.append(node);
        list.append(node2);
        assertEquals(node,list.peekFirst());
        assertEquals(node2,list.peekLast());
        assertEquals(2,list.size());
    }

    @Test
    public void AppendMultipleNodes(){
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        list.append(node);
        list.append(node2);
        list.append(node3);
        assertEquals(node,list.peekFirst());
        assertEquals(node3,list.peekLast());
        assertEquals(3,list.size());
    }

    @Test
    public void AppendLeftOneNode(){
        DequeNode<Integer> node = new DequeNode<>(1, null, null);
        list.appendLeft(node);
        assertEquals(node, list.peekFirst());
        assertEquals(1,list.size());
    }

    @Test
    public void AppendLeftTwoNodes(){
        DequeNode<Integer> node1 = new DequeNode<>(1, null, null);
        DequeNode<Integer> node2 = new DequeNode<>(2, null, null);
        list.appendLeft(node1);
        list.appendLeft(node2);
        assertEquals(node2, list.peekFirst());
        assertEquals(node1, list.peekLast());
        assertEquals(2,list.size());
    }

    @Test
    public void AppendLeftMultipleNodes(){
        DequeNode<Integer> node1 = new DequeNode<>(1, null, null);
        DequeNode<Integer> node2 = new DequeNode<>(2, null, null);
        DequeNode<Integer> node3 = new DequeNode<>(3, null, null);
        list.appendLeft(node3);
        list.appendLeft(node2);
        list.appendLeft(node1);
        assertEquals(node1, list.peekFirst());
        assertEquals(node3, list.peekLast());
        assertEquals(3,list.size());
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
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        list.append(node);
        list.deleteFirst();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0,list.size());
    }

    @Test
    public void DeleteFirstTwoNodes(){
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        list.append(node);
        list.append(node2);
        list.deleteFirst();
        assertEquals(node2,list.peekFirst());
        assertEquals(node2,list.peekLast());
        assertEquals(1,list.size());
    }

    @Test
    public void DeleteFirstMultipleNodes(){
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        list.append(node);
        list.append(node2);
        list.append(node3);
        list.deleteFirst();
        assertEquals(node2,list.peekFirst());
        assertEquals(node3,list.peekLast());
        assertEquals(2,list.size());
    }

    @Test
    public void DeleteLastNodeless(){
        list.deleteLast();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0, list.size());
    }

    @Test
    public void DeleteLastOneNode(){
        DequeNode<Integer> node = new DequeNode<>(1, null, null);
        list.append(node);
        list.deleteLast();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0, list.size());
    }

    @Test
    public void DeleteLastTwoNodes(){
        DequeNode<Integer> node1 = new DequeNode<>(1, null, null);
        DequeNode<Integer> node2 = new DequeNode<>(1, null, null);
        list.append(node1);
        list.append(node2);
        list.deleteLast();
        assertEquals(node1, list.peekFirst());
        assertEquals(node1, list.peekLast());
        assertEquals(1, list.size());
    }

    @Test
    public void DeleteLastMultipleNodes(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        list.append(node1);
        list.append(node2);
        list.append(node3);
        list.deleteLast();
        assertEquals(node1,list.peekFirst());
        assertEquals(node2,list.peekLast());
        assertEquals(2,list.size());
    }

    @Test
    public void GetAtNodeless(){
        assertNull(list.getAt(100));
    }

    @Test
    public void GetAtWithIncorrectIndex(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        list.append(node1);
        list.append(node2);
        list.append(node3);
        assertNull(list.getAt(-1));
        assertNull(list.getAt(0));
        assertNull(list.getAt(4));
        assertNull(list.getAt(1000));
    }

    @Test
    public void GetAtWithCorrectIndex(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        list.append(node1);
        list.append(node2);
        list.append(node3);
        assertEquals(node1,list.getAt(1));
        assertEquals(node2,list.getAt(2));
        assertEquals(node3,list.getAt(3));
    }

    @Test
    public void FindNodeless(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        assertNull(list.find(node1));
    }

    @Test
    public void FindIncorrectNode(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        list.append(node1);
        assertNull(list.find(2));
    }

    @Test
    public void FindCorrectNode(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        list.append(node1);
        list.append(node2);
        list.append(node3);
        assertEquals(node1,list.find(1));
        assertEquals(node2,list.find(2));
        assertEquals(node3,list.find(3));
    }


}
