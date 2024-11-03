package CA224.LinkedStacks;

public class Node<T> {
    T element;
    Node<T> next;

    Node(){
        element =null;
        next = null;
    }
    Node(T element){
        this.element = element;
        next = null;
    }

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
