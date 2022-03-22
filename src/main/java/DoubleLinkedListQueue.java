public class DoubleLinkedListQueue<T> implements DoubleEndedQueue<T> {

    private DequeNode<T> first;
    private DequeNode<T> last;

    public DoubleLinkedListQueue() {
        this.first = null;
        this.last = null;
    }

    public void append(DequeNode<T> node) {
        if(first == null){
            first = node;
            last = node;
            first.setPrevious(null);
            first.setNext(null);
            last.setNext(null);
            last.setPrevious(null);
        }else{
            last.setNext(node);
            node.setPrevious(last);
            last = node;
        }
    }

    public void appendLeft(DequeNode<T> node) {
        if(first == null){
            first = node;
            last = node;
            first.setPrevious(null);
            first.setNext(null);
            last.setNext(null);
            last.setPrevious(null);
        }else{
            first.setPrevious(node);
            node.setNext(first);
            first = node;
        }
    }

    public void deleteFirst() {
        if(first != null){
            if (first.equals(last)){
                first = null;
                last = null;
            }else if(first.getNext().equals(last)){
                first.setPrevious(null);
                first.setNext(null);
                last.setPrevious(null);
                last.setNext(null);
                first = last;
            }else{
                first = first.getNext();
                first.setPrevious(null);
            }
        }
    }

    public void deleteLast() {
        if(first != null){
            if(first.equals(last)){
                first = null;
                last = null;
            }
            else if(first.getNext().equals(last)){
                first.setPrevious(null);
                first.setNext(null);
                last.setPrevious(null);
                last.setNext(null);
                last = first;
            }
            else{
                last = last.getPrevious();
                last.setNext(null);
            }
        }
    }

    public DequeNode<T> peekFirst() {
        return first;
    }

    public DequeNode<T> peekLast() {
        return last;
    }

    public int size() {
        DequeNode<T> temp = first;
        int size = 0;
        while (temp != null){
            temp = temp.getNext();
            size++;
        }
        return size;
    }
}