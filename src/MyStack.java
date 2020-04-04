import java.util.LinkedList;

public class MyStack<E> {
    private LinkedList<E> elements;

    public MyStack() {
        elements = new LinkedList();
    }

    public void push(E e) {
        elements.addFirst(e);
    }

    public E pop(){
        return elements.removeFirst();
    }
}
