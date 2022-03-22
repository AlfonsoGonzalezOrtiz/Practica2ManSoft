public class DoubleLinkedListQueue<T> implements DoubleEndedQueue<T> {

    private DequeNode<T> list;

    public DoubleLinkedListQueue() {
        this.list = null;
    }

    public void append(DequeNode<T> node) {
        if(list == null) {
            list = node;
        } else {
            DequeNode<T> temp = this.list;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            node.setPrevious(temp);
            temp.setNext(node);
        }
    }

    public void appendLeft(DequeNode<T> node) {
        node.setNext(this.list);
        this.list.setPrevious(node);
        this.list = node;
    }

    public void deleteFirst() {
        if(this.list == null) {
            throw new RuntimeException("Cannot delete from empty list");
        }

        this.list = this.list.getNext();
        if(this.list != null) {
            this.list.setPrevious(null);
        }
    }

    public void deleteLast() {
        if(this.list == null) {
            throw new RuntimeException("Cannot delete from empty list");
        }

        if(this.list.getNext() == null) {
            this.list = null;
        }

        DequeNode<T> temp = this.list;
        while(temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
    }

    public DequeNode<T> peekFirst() {
        return this.list;
    }

    public DequeNode<T> peekLast() {
        if(list == null) {
            return null;
        }
        DequeNode<T> temp = this.list;
        while(temp.getNext() != null) {
            temp = temp.getNext();
        }
        return temp;
    }

    public int size() {
        int i = 0;
        DequeNode<T> temp = this.list;
        while(temp != null) {
            temp = temp.getNext();
            ++i;
        }
        return i;
    }
}