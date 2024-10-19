package CA224.Stack.Generics;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    //variables
    private static final int DEFAULT_CAPACITY = 3;
    private int top;
    private T[] stack;

    //constructors

    public ArrayStack(int size) {
        top = 0;
        stack = (T[]) new Object[size];
    }

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    //operations - methods
    int size() {
        return top; // how many elements
    }

    boolean isEmpty() {
        return top == 0;
    }

    //push
    void push(T element) {
        if (size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }

    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }


    //peek
    T peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        return stack[top - 1];
    }

    //pop
    T pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        top--;
        T removedElement = stack[top];
        stack[top] = null;
        return removedElement;
    }
//tostring()


    @Override
    public String toString() {
        return "ArrayStack{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }

    //main method
    public static void main(String[] args) {
        ArrayStack<String> s1 = new ArrayStack<String>(4);
        s1.push("Ali");
        s1.push("omar");
        s1.push("hawa");
        s1.push("gedi");
        s1.push("Halima");

        System.out.println("Removed: " + s1.pop());
        System.out.println("size: " + s1.size());
        System.out.println("isempty: " + s1.isEmpty());
        System.out.println("top element: " + s1.peek());

        System.out.println("stack elements : " + s1.toString());
    }
}
