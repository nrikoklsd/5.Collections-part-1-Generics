package main;

public class PriorityQueue<T extends Droid> {
    private Droid[] stack;
    private int stackSize, capacity;

    public PriorityQueue(int capacity) {
        this.capacity = capacity + 1;
        stack = new Droid[this.capacity];
        stackSize = 0;
    }

    public void clear() {
        stack = new Droid[capacity];
        stackSize = 0;
    }

    public boolean isEmpty() {
        return stackSize == 0;
    }

    public boolean isFull() {
        return stackSize == capacity - 1;
    }

    public int size() {
        return stackSize;
    }

    public void insert(String name,int ID, int priority)
    {
        T newOne = (T) new Droid(name,ID , priority);

        stack[++stackSize] = newOne;
        int pos = stackSize;
        while (pos != 1 && newOne.getPriority() > stack[pos/2].getPriority())
        {
            stack[pos] = stack[pos/2];
            pos /=2;
        }
        stack[pos] = newOne;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.length; i++) {
            sb.append(stack[i] + "\n");
        }
        return sb.toString();
    }

    public T remove()
    {
        int parent, child;
        T item, temp;
        if (isEmpty() )
        {
            System.out.println("stack is empty");
            return null;
        }

        item = (T) stack[1];
        temp = (T) stack[stackSize--];

        parent = 1;
        child = 2;
        while (child <= stackSize)
        {
            if (child < stackSize && stack[child].getPriority() < stack[child + 1].getPriority())
                child++;
            if (temp.getPriority() >= stack[child].getPriority())
                break;

            stack[parent] = stack[child];
            parent = child;
            child *= 2;
        }
        stack[parent] = temp;
        return item;
    }
}
