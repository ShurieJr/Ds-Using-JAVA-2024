package CA221.Stacks;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    //variables
    private final static int DEFAULT_CAPACITY = 2;
    private int top;
    private T[] stack;  // array name
    //constructors

    public ArrayStack(int initial_Size) {
        this.top = 0;
        stack = (T[]) new Object[initial_Size];
    }
    public ArrayStack(){
       this(DEFAULT_CAPACITY);
    }


    //operations - methods
    int size(){
        return top;  // how many elements
    }
    //isempty()
    boolean isEmpty(){
        return top == 0;
    }

    //push(element)
    void push(T element){
        //if it is full
        if(size() == stack.length)
            expandCapacity();
        stack[top] = element;
        top++;
    }
    //expand capacity
    private void expandCapacity(){
        stack = Arrays.copyOf(stack, stack.length*2);
    }

    //peek
    T peek() throws EmptyStackException {
        if(isEmpty())
            throw new EmptyStackException();
        return stack[top-1];
    }

    //pop()
    T pop() throws EmptyStackException{
        if(isEmpty())
            throw new EmptyStackException();
        top--;
        T removedElement = stack[top];
        stack[top] = null;
        return removedElement;
    }

    @Override
    public String toString() {
        return "ArrayStack{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}';
    }

    //main
    public static void main(String[] args) {
      ArrayStack<String> s1 = new ArrayStack<String>(4);
      s1.push("Ali");
      s1.push("omar");
      s1.push("hawa");
      s1.push("halima");
      s1.push("gedi");
      s1.push("kaafi");

        System.out.println("size: " + s1.size());
        System.out.println("isempty: " + s1.isEmpty());
        System.out.println("removed element: " + s1.pop());
        System.out.println("top element: " + s1.peek());
        System.out.println("size: " + s1.size());

        System.out.println(s1.toString());

    }
}
