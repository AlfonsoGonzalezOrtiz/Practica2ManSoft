public class DoubleLinkedListQueue implements DoubleEndedQueue {

    private DequeNode list;

    public DoubleLinkedListQueue() {
        this.list = null;
    }

    public void append(DequeNode node) {
        if(list == null) {
            list = node;
        } else {
            DequeNode temp = this.list;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.next = node;
        }
    }

    public void appendLeft(DequeNode node) {
        node.next = this.list;
        this.list = node;
    }

    public void deleteFirst() {
        if(this.list == null) {
            throw new RuntimeException("Can't delete from empty list");
        }

        DequeNode temp = this.list;
        this.list = this.list.next;
        this.list.previous = null;
        temp = null;
    }

    public void deleteLast() {
        if(this.list == null) {
            throw new RuntimeException("Can't delete from empty list");
        }

        if(this.list.next = null) {
            this.list = null;
        }

        DequeNode temp = this.list;
        while(temp.getNext().getNext() != null) {
            temp = temp.getNext();
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
        DequeNode temp = this.list;
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }

    public int size() {
        int i = 0;
        DequeNode temp = this.list;
        while(temp != null) {
            temp = temp.getNext();
            ++i;
        }
        return i;
    }
}