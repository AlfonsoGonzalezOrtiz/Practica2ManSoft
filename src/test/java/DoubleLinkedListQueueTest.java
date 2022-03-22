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
    public void PeekFirstOneNode(){

    }

    @Test
    public void PeekFirstMultipleNodes(){

    }

    @Test
    public void PeekLastNodeless(){

    }

    @Test
    public void PeekLastOneNode(){

    }

    @Test
    public void PeekLastMultipleNodes(){

    }

    @Test
    public void SizeNodeless(){

    }

    @Test
    public void SizeOneNode(){

    }

    @Test
    public void SizeMultipleNodes(){

    }

    @Test
    public void AppendNodeless(){

    }

    @Test
    public void AppendOneNode(){

    }

    @Test
    public void AppendMultipleNodes(){

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
    public void DeleteFirstNodeless() {

    }

    @Test
    public void DeleteFirstOneNode(){

    }

    @Test
    public void DeleteFistMultipleNodes(){

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

    }

    @Test
    public void DeleteLastMultipleNodes(){

    }


}
