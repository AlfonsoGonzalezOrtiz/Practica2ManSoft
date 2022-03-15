public class DoubleLinkedListQueue implements DoubleEndedQueue<T> {

    private DequeNode list;

    public DoubleLinkedListQueue() {
        this.list = null;
    }

    public void append(DequeNode<T> node) {
        if(list == null) {
            list = node;
        } else {
            DequeNode<T> temp = this.list;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void appendLeft(DequeNode<T> node) {
        node.next = this.list;
        this.list = node;
    }
}