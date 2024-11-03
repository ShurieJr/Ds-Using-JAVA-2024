package CA224.LinkedStacks;

public class LinkedStack<T> {
    int count;
    Node<T> top;  //head / front

    LinkedStack() {
        count = 0;
        top = null;
    }

    //size
    int size() {
        return count;
    }

    //isempty
    boolean isEmpty() {
        return count == 0;  //top == null;
    }

    //push
    void push(T element) {
        Node<T> tempAddress = new Node<>(element);
        tempAddress.setNext(top);
        top = tempAddress;
        count++;
    }

    //pop
    T pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
            return null;
        }
        T removed = top.getElement();
        top = top.getNext();
        count--;
        return removed;
    }

    //peek
    T peek() {
        if (isEmpty()) {
            System.out.println("Empty Stack!");
            return null;
        }
        return top.getElement();
    }
    //print
}
