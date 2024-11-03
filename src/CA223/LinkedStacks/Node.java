package CA223.LinkedStacks;

public class Node<T> {
    private T element;
    private Node<T> next;

    Node() {
        element = null;
        next = null;
    }

    Node(T element) {
        this.element = element;
        next = null;
    }

    // get & set
    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
