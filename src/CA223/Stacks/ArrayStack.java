package CA223.Stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    //variables
    private static final int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;    //array name

    //constructors
    public ArrayStack(int size) {
        top = 0;
        stack = (T[]) new Object[size];
    }

    ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    //methods -- operations
    //size
    int size() {
        return top;
    }

    //isempty -- boolean
    boolean isempty() {
        return top == 0;
//        if(top == 0)
////            return true;
////        return false;
    }

    //push
    void push(T element) {
        // if (size() == stack.length)
        if (isFull())
            expandCapacity();

        stack[top] = element;
        top++;
//        return element;
    }

    //expand capacity
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2);
    }

    //peek
    T peek() {
        if (isempty()) {
            System.out.println("The stack is empty!");
            return null;
        }
        return stack[top - 1];
    }

    //pop
    T pop() throws EmptyCollectionException {
        if (isempty())  // if(top == 0)
            throw new EmptyCollectionException("Stack");
        top = top - 1;  //top--;
        T result = stack[top];
        stack[top] = null;
        return result;
    }
    //tostring


    @Override
    public String toString() {
        return "ArrayStack{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }

    void display() {
        for (int i = top - 1; i > 0; i--) {
            System.out.println(stack[i]);
        }
    }

    int getCapacity() {
        return stack.length;
    }

    //isfull
    boolean isFull() {
        return size() == stack.length;
        //return top == stack.length;
    }

    int countFreq(T element) {
        int index = top - 1;
        int count = 0;
        for (int i = 0; i < index; i++) {
            if (stack[i] == element)
                count++;
        }
        return count;
    }


    public static void main(String[] args) {
        ArrayStack<String> names = new ArrayStack<String>(3);
        //names.peek();  //-------------------------->
        names.push("osman");
        names.push("Farah");
        names.push("Farah");
        names.push("Hawa");
        names.push("Hawa");
        names.push("Hawa");
        names.push("Warsame");
        int times = names.countFreq("pp");
        if(times == 0)
            System.out.println("Not found!");
        else
            System.out.println("Found " + times + " times");
//        System.out.println("Removed element: " + names.pop());
//        System.out.println("size: " + names.size());
//        System.out.println("top: " + names.peek());
//        System.out.println("empty: " + names.isempty());
//
//        //System.out.println(names.toString());
//        names.display();


    }
}
