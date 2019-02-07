package DeQueue;


import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

public class MyDeque<E> implements Deque<E> {

    private Node<E> root;
    private int count;

    public MyDeque(){}

    public MyDeque(E info){
        this.root = new Node<>(info);
        count = 0;
    }

    @Override
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        if (root == null) {
            root = newNode;
            return;
        }
        root.setPrevious(newNode);
        newNode.setNext(root);
        root = newNode;
    }

    @Override
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (root == null) {
            root = newNode;
            return;
        }
        Node<E> currNode = root;
        while (currNode.hasNext()) currNode = currNode.next();
        currNode.setNext(newNode);
        newNode.setPrevious(currNode);
    }

    @Override
    public boolean offerFirst(E e) {
        Node<E> newNode = new Node<>(e);
        if (root == null) {
            root = newNode;
            return true;
        }
        root.setPrevious(newNode);
        newNode.setNext(root);
        root = newNode;
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node<E> currNode = root;
        while (currNode.hasNext()) currNode = currNode.next();
        currNode.setNext(newNode);
        newNode.setPrevious(currNode);
        return true;
    }

    @Override
    public E removeFirst() {
        if (root == null) return null;
        E value = root.getInfo();
        root = root.next();
        root.next().setPrevious(null);
        return value;
    }

    @Override
    public E removeLast() {
        if (root == null) return null;
        Node<E> currNode = root;
        E value = currNode.getInfo();
        while (currNode.hasNext()) currNode = currNode.next();
        currNode.previous().setNext(null);
        currNode.setPrevious(null);
        return value;
    }

    @Override
    public E pollFirst() {
        if (root == null) return null;
        E value = root.getInfo();
        root = root.next();
        root.next().setPrevious(null);
        return value;
    }

    @Override
    public E pollLast() {
        if (root == null) return null;
        Node<E> currNode = root;

        while (currNode.hasNext()) currNode = currNode.next();
        E value = currNode.getInfo();
        currNode.previous().setNext(null);
        currNode.setPrevious(null);
        return value;
    }

    @Override
    public E getFirst() {
        if (root == null) return null;
        return root.getInfo();
    }

    @Override
    public E getLast() {
        if (root == null) return null;
        Node<E> currNode = root;
        while (currNode.hasNext()) currNode = currNode.next();
        E value = currNode.getInfo();
        return value;
    }

    @Override
    public E peekFirst() {
        if (root == null) return null;
        return root.getInfo();
    }

    @Override
    public E peekLast() {
        if (root == null) return null;
        Node<E> currNode = root;
        while (currNode.hasNext()) currNode = currNode.next();
        E value = currNode.getInfo();
        return value;
    }

    @Override
    public boolean removeFirstOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean removeLastOccurrence(Object o) {
        return false;
    }

    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node<E> currNode = root;
        while (currNode.hasNext()) currNode = currNode.next();
        currNode.setNext(newNode);
        newNode.setPrevious(currNode);
        return true;
    }

    @Override
    public boolean offer(E e) {
        return false;
    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E element() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public void push(E e) {

    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public Iterator<E> descendingIterator() {
        return null;
    }

    @Override
    public String toString() {
        if (root == null) return "";
        StringBuilder line = new StringBuilder();
        Node<E> currNode = root;
        while (currNode.hasNext()) {
            line.append(currNode.getInfo().toString() + " ");
            currNode = currNode.next();
        }
        line.append(currNode.getInfo().toString() + " ");
        return line.toString();
    }
}