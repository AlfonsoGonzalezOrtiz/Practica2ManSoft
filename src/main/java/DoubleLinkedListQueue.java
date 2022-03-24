import java.util.Comparator;

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
     * @param node node to add to the list
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
     * @param node node to add to the list
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

    /**
     * Returns the node at position i, starting with 1, ending with size().
     * If i is out of bounds for the list, null is returned.
     *
     * @param i position
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
     * Returns node with item equals to the parameter item.
     * Returns null if the list is empty or if the item is not found.
     *
     * @param item item to find in list
     */
    public DequeNode<T> find(T item) {
        int i = 1;
        DequeNode<T> result = null;
        if(this.first != null) {
            result = first;
            while(i < this.size() && !result.getItem().equals(item)) {
                result = result.getNext();
                ++i;
            }
            if(!result.getItem().equals(item)) {
                result = null;
            }
        }
        return result;
    }

    /**
     * Deletes the node equal to the parameter.
     * Does nothing if the list is empty.
     *
     * @param node node to delete
     */
    public void delete(DequeNode<T> node) {
        if(this.first != null) {
            int i = 1;
            DequeNode<T> temp = this.first;
            while(i < this.size() && !temp.equals(node)) {
                temp = temp.getNext();
                ++i;
            }
            if(temp.equals(node)) {
                if(temp.getNext() != null) {
                    temp.getNext().setPrevious(temp.getPrevious());
                }
                if(temp.getPrevious() != null) {
                    temp.getPrevious().setNext(temp.getNext());
                }
            }
        }
    }

    @Override
    public void sort(Comparator<DequeNode<T>> comparator) {
        int size = size();
        DequeNode<T> prev = first;
        DequeNode<T> next;
        if(prev != null){
            next = first.getNext();
        }
        for(int i = 0; i < size;i++){
            next = prev.getNext();
            for(int j = i + 1; j < size;j++){
                if(comparator.compare(prev,next) > 0){
                    DequeNode<T> temp = prev;
                    prev = next;
                    next = temp;
                }
                next = next.getNext();
            }
            prev = prev.getNext();
        }
    }


}