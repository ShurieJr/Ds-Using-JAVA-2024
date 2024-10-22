package CA224.Stack.Generics;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<T> {
    // Constant for the default capacity of the stack
    private static final int DEFAULT_CAPACITY = 3;

    // Variable to track the top index of the stack (also indicates the number of elements)
    private int top;

    // Array to store the elements in the stack
    private T[] stack;

    // Constructor that initializes the stack with a specified size
    public ArrayStack(int size) {
        top = 0; // Start with an empty stack
        stack = (T[]) new Object[size]; // Create an array of the specified size
    }

    // Default constructor that initializes the stack with the default capacity
    public ArrayStack() {
        this(DEFAULT_CAPACITY); // Use the default capacity if no size is specified
    }

    // Method to return the current size of the stack (number of elements in the stack)
    int size() {
        return top; // Return the index of the top, which equals the number of elements
    }

    // Method to check if the stack is empty
    boolean isEmpty() {
        return top == 0; // Stack is empty if top is 0
    }

    // Method to add an element to the stack
    void push(T element) {
        // If the stack is full, expand the capacity
        //if (size() == stack.length)
        if (isFull())
            expandCapacity();

        // Add the new element to the top of the stack and increment the top
        stack[top] = element;
        top++;
    }

    // Helper method to double the capacity of the stack when it becomes full
    private void expandCapacity() {
        stack = Arrays.copyOf(stack, stack.length * 2); // Double the size of the stack
    }

    // Method to return the top element of the stack without removing it
    T peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty!"); // Print a message if the stack is empty
            return null;
        }
        return stack[top - 1]; // Return the top element (without removing it)
    }

    // Method to remove and return the top element of the stack
    T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            // Throw an exception if the stack is empty
            throw new EmptyCollectionException("Stack");
        }
        top--; // Decrease the top index
        T removedElement = stack[top]; // Store the removed element
        stack[top] = null; // Nullify the removed element
        return removedElement; // Return the removed element
    }

    // Override the toString method to provide a string representation of the stack
    @Override
    public String toString() {
        return "ArrayStack{" +
                "top=" + top +
                ", stack=" + Arrays.toString(stack) +
                '}'; // Return a string containing the top index and the elements of the stack
    }

    //sfull
    boolean isFull(){
        return top == stack.length;   //return size() == stack.length;
    }
    int getLength(){
        return stack.length;
    }

    //display
    void display(){
        if(isEmpty())
            System.out.println("the stack is empty!");
        else{
            for(int i = top-1 ; i >= 0; i--)
                System.out.println(stack[i]);
        }
    }

    // Main method to test the ArrayStack class
    public static void main(String[] args) {
        // Create a new stack of Strings with a capacity of 4
        ArrayStack<String> s1 = new ArrayStack<String>(4);

        // Add elements to the stack
        s1.push("Ali");
        s1.push("Omar");
        s1.push("Hawa");
        s1.push("Gedi");
        s1.push("Gedi");
        s1.push("Gedi");
        s1.push("Gedi");
        s1.push("Halima"); // This will trigger the expandCapacity method since the stack is full

        // Remove the top element and display it
        System.out.println("Removed: " + s1.pop());

        // Display the size of the stack
        System.out.println("size: " + s1.size());

        // Check if the stack is empty
        System.out.println("isempty: " + s1.isEmpty());

        // Peek at the top element of the stack without removing it
        System.out.println("top element: " + s1.peek());

        // Display the elements of the stack
        System.out.println("stack elements : " );
        s1.display();
        System.out.println("stack capacity: " + s1.getLength());
        System.out.println("sifull:" + s1.isFull());
    }
}
