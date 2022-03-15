public class DoubleLinkedListQueue implements DoubleEndedQueue<T> {

    private DequeNode list;

    public DoubleLinkedListQueue() {
        this.list = null;
    }

    public append(DequeNode<T> node) {
        if(list == null) {
            list = node;
        } else {
            DequeNode<T> temp = list;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
}