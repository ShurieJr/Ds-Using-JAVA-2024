package CA223.LinkedStacks;

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



    //main method
    public static void main(String[] args) {
        LinkedStack<String> names = new LinkedStack<>();
        names.push("Ali");
        names.push("Gedi");
        names.push("Hawa");

        System.out.println("removed element : " + names.pop());
        System.out.println("top: " + names.peek() );
        System.out.println("size: " + names.size() );
        System.out.println("empty: " + names.isEmpty() );
    }
}
