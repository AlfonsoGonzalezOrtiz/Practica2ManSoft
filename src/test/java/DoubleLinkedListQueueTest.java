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

    }

    @Test
    public void AppendLeftOneNode(){

    }

    @Test
    public void AppendLeftMultipleNodes(){

    }

    @Test
    public void DeleteFirstNodeless(){

    }

    @Test
    public void DeleteFirstOneNode(){

    }

    @Test
    public void DeleteFistMultipleNodes(){

    }

    @Test
    public void DeleteLastNodeless(){

    }

    @Test
    public void DeleteLastOneNode(){

    }

    @Test
    public void DeleteLastMultipleNodes(){

    }


}
