package CA223.LinkedStacks;

import java.util.Scanner;

public class LinkedStack <T>{
    int count;
    Node<T> top ;  //head

    LinkedStack(){
        count = 0;
        top = null;
    }
    //operations
    //size
    int size(){return count;}
    //isempty
    boolean isEmpty(){
        return count == 0; // top == null;
    }

    //push
    void push(T element){
        Node<T> tempAddress = new Node<>(element);
        //System.out.println("temp address: " + tempAddress);
        tempAddress.setNext(top);
        top = tempAddress;
        count++;
    }

    //pop
    T pop(){
        if(isEmpty()){
            System.out.println("Empty Stack!");
            return null;
        }
        T removedElement = top.getElement();
        top = top.getNext();
        count--;
        return removedElement;
    }
    //peek
    T peek(){
        if(isEmpty()){
            System.out.println("Empty Stack!");
            return null;
        }
        return top.getElement();
    }
    //display linkedstack elements
    void display(){
        //if is empty
        if(isEmpty())
            System.out.println("Stack is empty!");
        else{
            Node<T> currentAddress = top;
            while (currentAddress != null){
                System.out.println(currentAddress.getElement());
                currentAddress = currentAddress.getNext();
            }
        }
    }
    //searchElement
    void searchElement(T data){
        boolean found = false;
        int counter = 0;
        if(isEmpty())
            System.out.println("Stack is empty!");
        else{
            Node<T> currentAddress = top;
            while (currentAddress != null){
                if(data.equals(currentAddress.getElement())){
                    found = true;
                    counter++;
                }
                currentAddress = currentAddress.getNext();
            }
        }
      //display result
        if(found == false)
            System.out.println("not found!");
        else
            System.out.println("found " + counter + " times");
    }


    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedStack<String> names = new LinkedStack<>();
        names.push("Ali");
        names.push("Ali");
        names.push("Gedi");
        names.push("Hawa");

        System.out.println("removed element : " + names.pop());
        System.out.println("top: " + names.peek() );
        System.out.println("size: " + names.size() );
        System.out.println("empty: " + names.isEmpty() );
        names.display();
        System.out.println("Enter name to search: ");
        String data = scanner.next();
        names.searchElement(data);
    }
}
