package DeQueue;

import java.util.Iterator;
import java.util.function.Consumer;

public class Node<E> implements Iterator {
    private E info;
    private Node<E> next;
    private Node<E> previous;

    public Node(E info){
        this.info = info;
    }

    public void add(Node<E> next){
        this.next = next;
        next.previous = this;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public Node<E> next() {
        return next;
    }

    public void setNext(Node<E> node){
        this.next = node;
    }

    public void setPrevious(Node<E> node){
        this.previous = node;
    }

    public boolean hasPrevious() {
        return previous != null;
    }

    public Node<E> previous() {
        return previous;
    }

    @Override
    public void remove() {
        previous.next = next;
        next.previous = previous;

    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }


}