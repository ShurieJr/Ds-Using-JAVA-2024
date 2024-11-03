package CA221.LinkedStacks;

public class Node <T> {
    //variables
    T element;  //data
    Node<T> next;  // address

    //constructors

    public Node() {
        element = null;
        next = null;
    }

    public Node(T element) {
        this.element = element;
        this.next = null;
    }

    //get & set


    public Node<T> getNext() {
        return next;
    }

    public T getElement() {
        return element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setElement(T element) {
        this.element = element;
    }
}
