public class DoubleLinkedListQueue<T> implements DoubleEndedQueue<T> {

    private DequeNode<T> first;
    private DequeNode<T> last;

    public DoubleLinkedListQueue() {
        this.first = null;
        this.last = null;
    }

    /**
     * Adds the node parameter at the end of the list.
     *
     * @param node
     */
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

    /**
     * Adds the node parameter at the beginning of the list.
     *
     * @param node
     */
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

    /**
     * Deletes the first node of the list.
     *
     */
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

    /**
     * Deletes the last node of the list.
     *
     */
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

    /**
     * Returns the first element of the list. Returns null if the list is empty.
     *
     * @return first
     */
    public DequeNode<T> peekFirst() {
        return first;
    }

    /**
     * Returns the last element of the list. Returns null if the list is empty.
     *
     * @return last
     */
    public DequeNode<T> peekLast() {
        return last;
    }

    /**
     * Returns the node at position i, starting with 1, ending with size().
     * If i is out of bounds for the list, null is returned.
     *
     * @param i
     */
    public DequeNode<T> getAt(int i) {
        DequeNode<T> result = null;
        if(i > 0 && i <= this.size()) {
            int cnt = 1;
            result = this.first;
            while(cnt < i) {
                result = result.getNext();
                ++cnt;
            }
        }
        return result;
    }

    /**
     * Returns the size of the list. Returns 0 if the list is empty.
     *
     * @return size
     */
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