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

    public void deleteFirst() {
        if(this.list == null) {
            throw new RuntimeException("Can't delete from empty list");
        }

        DequeNode<T> temp = this.list;
        this.list = this.list.next;
        temp = null;
    }

    public void deleteLast() {
        if(this.list == null) {
            throw new RuntimeException("Can't delete from empty list");
        }

        if(this.list.next = null) {
            this.list = null;
        }

        DequeNode<T> temp = this.list;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp = null;
    }

    public DequeNode<T> peekFirst() {
        return this.list;
    }

    public DequeNode<T> peekLast() {
        if(list == null) {
            return null;
        }
        DequeNode<T> temp = this.list;
        while(temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }
}