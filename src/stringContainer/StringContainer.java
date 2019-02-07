package stringContainer;

import java.util.AbstractList;

public class StringContainer extends AbstractList<String> {
    private String[] storage = null;

    private static int initialSize = 10;

    private int size = 0;

    private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;

    public StringContainer() {
        this(initialSize);
    }

    public StringContainer(int capacity) {
        storage = new String[capacity];
    }

    public boolean add(String s) {
        if (size == MAX_ARRAY_SIZE) return false;
        if (this.size == this.storage.length) {
            int newStorageSize = this.storage.length * 2 > MAX_ARRAY_SIZE ?
                    MAX_ARRAY_SIZE : this.storage.length * 2;
            String[] newStorage = new String[newStorageSize];
            System.arraycopy(this.storage, 0, newStorage, 0, storage.length);
            this.storage = newStorage;
        }
        this.storage[this.size++] = s;
        return true;
    }

    @Override
    public String get(int index) {
        return storage[index];
    }

    @Override
    public int size() {
        return this.size;
    }
}
