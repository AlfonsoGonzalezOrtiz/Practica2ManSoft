/**
 * Class representing a node of a double-ended queue (deque). Each node has pointers to
 * the next and previous nodes.
 * The previous and next of the first and last node of the deque is null.
 *
 * @param <T>
 */
public class DequeNode<T> {
    private T item;
    private DequeNode next;
    private DequeNode previous;

    public void setItem(T item) {
        this.item = item;
    }

    public void setNext(DequeNode next) {
        this.next = next;
    }

    public void setPrevious(DequeNode previous) {
        this.previous = previous;
    }

    public T getItem() {
        return item;
    }

    public DequeNode getNext() {
        return next;
    }

    public DequeNode getPrevious() {
        return previous;
    }

    public DequeNode(T item, DequeNode next, DequeNode previous) {
        this.item = item;
        this.next = next;
        this.previous = previous;
    }

    public boolean isFirstNode() {
        return previous == null;
    }

    public boolean isLastNode() {
        return next == null;
    }

    public boolean isNotATerminalNode() {
        return (!isFirstNode() && !isLastNode());
    }
}