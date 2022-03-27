package org.example;

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
        if(!node.equals(find(node.getItem()))){
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
                node.setNext(null);
                last = node;
            }
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
        if(first != null){
            DequeNode<T> found = find(node.getItem());
            if(first.equals(found)){
                first = first.getNext();
                if(first != null){
                    first.setPrevious(null);
                }
            }else if(last.equals(found)){
                last = found.getPrevious();
                if(last != null){
                    last.setNext(null);
                }
            }else{
                found.getPrevious().setNext(found.getNext());
                found.getNext().setPrevious(found.getPrevious());
            }
        }

    }

    @Override
    public void sort(Comparator<DequeNode<T>> comparator) {
        int size = size();
        for(int i = 1; i <= size;i++){
            for(int j = i+1; j <= size;j++){
                DequeNode<T> prev = getAt(i);
                DequeNode<T> next = getAt(j);
                if(comparator.compare(prev,next) > 0){
                    T temp = prev.getItem();
                    prev.setItem(next.getItem());
                    next.setItem(temp);
                }
            }
        }
    }
}