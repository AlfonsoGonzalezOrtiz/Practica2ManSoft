import org.example.DequeNode;
import org.example.DoubleLinkedListQueue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class DoubleLinkedListQueueTest {

    private DoubleLinkedListQueue list;

    @BeforeEach
    void init(){
        list = new DoubleLinkedListQueue<>();
    }

    @Test
    void PeekFirstNodeless() {
        assertNull(list.peekFirst());
    }

    @Test
    void PeekLastNodeless(){
        assertNull(list.peekLast());
    }

    @Test
    void SizeNodeless(){
        assertEquals(0,list.size());
    }


    @Test
    void AppendOneNode(){
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        list.append(node);
        assertEquals(node,list.peekFirst());
        assertEquals(node,list.peekLast());
        assertEquals(1,list.size());
        assertNull(node.getPrevious());
        assertNull(node.getNext());
    }

    @Test
    void AppendTwoNodes(){
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        list.append(node);
        list.append(node2);
        assertEquals(node,list.peekFirst());
        assertEquals(node2,list.peekLast());
        assertEquals(2,list.size());
        assertNull(node.getPrevious());
        assertEquals(node,node2.getPrevious());
        assertEquals(node.getNext(),node2);
        assertNull(node2.getNext());
    }

    @Test
    void AppendMultipleNodes(){
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        list.append(node);
        list.append(node2);
        list.append(node3);
        assertEquals(node,list.peekFirst());
        assertEquals(node3,list.peekLast());
        assertEquals(3,list.size());
        assertNull(node.getPrevious());
        assertEquals(node,node2.getPrevious());
        assertEquals(node.getNext(),node2);
        assertEquals(node,node2.getPrevious());
        assertEquals(node2.getNext(),node3);
        assertEquals(node2,node3.getPrevious());
        assertNull(node3.getNext());
    }

    @Test
    void AppendSameNodes(){
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        list.append(node);
        list.append(node2);
        list.append(node);
        assertNull(node.getPrevious());
        assertEquals(node.getNext(),node2);
        assertNull(node2.getNext());
    }

    @Test
    void AppendLeftOneNode(){
        DequeNode<Integer> node = new DequeNode<>(1, null, null);
        list.appendLeft(node);
        assertEquals(node, list.peekFirst());
        assertEquals(1,list.size());
    }

    @Test
    void AppendLeftTwoNodes(){
        DequeNode<Integer> node1 = new DequeNode<>(1, null, null);
        DequeNode<Integer> node2 = new DequeNode<>(2, null, null);
        list.appendLeft(node1);
        list.appendLeft(node2);
        assertEquals(node2, list.peekFirst());
        assertEquals(node1, list.peekLast());
        assertEquals(2,list.size());
    }

    @Test
    void AppendLeftMultipleNodes(){
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
    void DeleteFirstNodeless(){
        list.deleteFirst();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0,list.size());
    }

    @Test
    void DeleteFirstOneNode(){
        DequeNode<Integer> node = new DequeNode<>(1,null,null);
        list.append(node);
        list.deleteFirst();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0,list.size());
    }

    @Test
    void DeleteFirstTwoNodes(){
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
    void DeleteFirstMultipleNodes(){
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
    void DeleteLastNodeless(){
        list.deleteLast();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0, list.size());
    }

    @Test
    void DeleteLastOneNode(){
        DequeNode<Integer> node = new DequeNode<>(1, null, null);
        list.append(node);
        list.deleteLast();
        assertNull(list.peekFirst());
        assertNull(list.peekLast());
        assertEquals(0, list.size());
    }

    @Test
    void DeleteLastTwoNodes(){
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
    void DeleteLastMultipleNodes(){
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
    void GetAtNodeless(){
        assertNull(list.getAt(100));
    }

    @Test
    void GetAtWithIncorrectIndex(){
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
    void GetAtWithCorrectIndex(){
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
    void FindNodeless(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        assertNull(list.find(node1));
    }

    @Test
    void FindIncorrectNode(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        list.append(node1);
        assertNull(list.find(2));
    }

    @Test
    void FindCorrectNode(){
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

    @Test
    void DeleteNodeless(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        list.delete(node1);
        assertEquals(0,list.size());
    }

    @Test
    void DeleteUniqueNode(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        list.append(node1);
        list.delete(node1);
        assertEquals(0,list.size());
    }

    @Test
    void DeleteFirstNode(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        list.append(node1);
        list.append(node2);
        list.append(node3);
        list.delete(node1);
        assertEquals(2,list.size());
        assertNull(node2.getPrevious());
        assertEquals(node2.getNext(),node3);
        assertNull(list.find(1));
        assertNull(node2.getPrevious());
        assertNull(node3.getNext());
    }

    @Test
    void DeleteMidNode(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        list.append(node1);
        list.append(node2);
        list.append(node3);
        list.delete(node2);
        assertEquals(2,list.size());
        assertEquals(node1.getNext(),node3);
        assertEquals(node1,node3.getPrevious());
        assertNull(list.find(2));
        assertNull(node1.getPrevious());
        assertNull(node3.getNext());
    }

    @Test
    void DeleteLastNode(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        list.append(node1);
        list.append(node2);
        list.append(node3);
        list.delete(node3);
        assertEquals(2,list.size());
        assertEquals(node1,node2.getPrevious());
        assertNull(node2.getNext());
        assertNull(list.find(3));
        assertNull(node1.getPrevious());
        assertNull(node2.getNext());
    }


    @Test
    void SortWithDifferentItems(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        DequeNode<Integer> node4 = new DequeNode<>(4,null,null);
        DequeNode<Integer> node5 = new DequeNode<>(5,null,null);
        DequeNode<Integer> node6 = new DequeNode<>(6,null,null);
        list.append(node2);
        list.append(node4);
        list.append(node1);
        list.append(node6);
        list.append(node5);
        list.append(node3);
        list.sort(Comparator.comparingInt((DequeNode o) -> (Integer) o.getItem()));
        assertEquals("1",list.getAt(1).getItem().toString());
        assertEquals("2",list.getAt(2).getItem().toString());
        assertEquals("3",list.getAt(3).getItem().toString());
        assertEquals("4",list.getAt(4).getItem().toString());
        assertEquals("5",list.getAt(5).getItem().toString());
        assertEquals("6",list.getAt(6).getItem().toString());

        assertEquals(list.getAt(1).getNext(),list.getAt(2));
        assertEquals(list.getAt(2).getNext(),list.getAt(3));
        assertEquals(list.getAt(3).getNext(),list.getAt(4));
        assertEquals(list.getAt(4).getNext(),list.getAt(5));
        assertEquals(list.getAt(5).getNext(),list.getAt(6));
        assertNull(list.getAt(6).getNext());

        assertNull(list.getAt(1).getPrevious());
        assertEquals(list.getAt(2).getPrevious(),list.getAt(1));
        assertEquals(list.getAt(3).getPrevious(),list.getAt(2));
        assertEquals(list.getAt(4).getPrevious(),list.getAt(3));
        assertEquals(list.getAt(5).getPrevious(),list.getAt(4));
        assertEquals(list.getAt(6).getPrevious(),list.getAt(5));
    }

    @Test
    void SortWithSameItems(){
        DequeNode<Integer> node1 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node2 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node3 = new DequeNode<>(3,null,null);
        DequeNode<Integer> node4 = new DequeNode<>(1,null,null);
        DequeNode<Integer> node5 = new DequeNode<>(2,null,null);
        DequeNode<Integer> node6 = new DequeNode<>(3,null,null);
        list.append(node2);
        list.append(node4);
        list.append(node1);
        list.append(node6);
        list.append(node5);
        list.append(node3);
        list.sort(Comparator.comparingInt((DequeNode o) -> (Integer) o.getItem()));
        assertEquals("1",list.getAt(1).getItem().toString());
        assertEquals("1",list.getAt(2).getItem().toString());
        assertEquals("2",list.getAt(3).getItem().toString());
        assertEquals("2",list.getAt(4).getItem().toString());
        assertEquals("3",list.getAt(5).getItem().toString());
        assertEquals("3",list.getAt(6).getItem().toString());
    }
}
