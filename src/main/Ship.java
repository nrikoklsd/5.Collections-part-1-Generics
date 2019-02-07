package main;

import java.util.Arrays;

public class Ship<T extends Droid> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public Ship(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(Droid e){
        if(size == elements.length){
            increase_capacity();
        }
        elements[size++] = e;
    }

    private void increase_capacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @SuppressWarnings("unchecked")
    public T get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (T) elements[i];
    }
}
