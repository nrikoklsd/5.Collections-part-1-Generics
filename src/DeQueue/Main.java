package DeQueue;

    public class Main {

        static public void main(String ... args){
            MyDeque<String> deque = new MyDeque<>();

            deque.addLast("Andriy");
            deque.addLast("Nazar");
            deque.addLast("Jeka");
            deque.addLast("Yaroslav");

            System.out.println(deque.toString());
        }
    }

