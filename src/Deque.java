import java.util.LinkedList;

public class Deque<T> {
    LinkedList<T> list;

    public Deque() {
        list = new LinkedList<>();
    }

    public void addFront(T item) {
        list.addFirst(item);
    }

    public void addTail(T item) {
        list.addLast(item);
    }

    public T removeFront() {
        if (size() != 0) {
            return list.removeFirst();
        }

        return null;
    }

    public T removeTail() {
        if (size() != 0) {
            return list.removeLast();
        }

        return null;
    }

    public int size() {
        if (list.isEmpty()) {
            return list.size();
        }

        return 0;
    }
}
