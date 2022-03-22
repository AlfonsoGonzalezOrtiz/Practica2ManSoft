import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleLinkedListQueueTest {

    private DequeNode node;

    @Test
    public void hasOneNode() {
        node = new DequeNode(1, null, null);
        DequeNode expectedPrevious = null;
        DequeNode expectedNext = null;
        boolean expectedFirst = true;
        boolean expectedLast = true;
    }
}
