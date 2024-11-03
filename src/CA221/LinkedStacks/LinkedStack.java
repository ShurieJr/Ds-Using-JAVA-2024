package CA221.LinkedStacks;

public class LinkedStack<T> {
    int count;
    Node<T> top;  // head reference

    LinkedStack() {
        count = 0;
        top = null;
    }

    //operations
    //size
    int size() {
        return count;
    }

    //isemtpy
    boolean isEmpty() {
        return count == 0;  // top == null;
    }

    //push
    void push(T element) {
        //1.create new node
        Node<T> temp = new Node<>(element);
        //2. set next
        temp.setNext(top);
        //3. update the top (new node address)
        top = temp;
        //4. increment
        count++;
    }

    //pop
    T pop() {
        if (isEmpty()) {
            System.out.println("The Linkedstack is Empty!");
            return null;
        }
        T removedElement = top.getElement();
        top = top.getNext();
        count--;
        return removedElement;
    }

    //peek
    T peek(){
        if (isEmpty()) {
            System.out.println("The Linkedstack is Empty!");
            return null;
        }
        return top.getElement();
    }

    //prnit stack elements
    void display(){
        if (isEmpty()) {
            System.out.println("The Linkedstack is Empty!");
            return;
        }
       Node<T> currentAddress = top;
        while (currentAddress != null){
            System.out.println(currentAddress.getElement());
            currentAddress = currentAddress.getNext();
        }
    }

    // search
    boolean searchElement(T data){
        boolean found = false;
        Node<T> tempAddress = top;
        if(!isEmpty()){
            while (tempAddress != null){
                if(data.equals(tempAddress.getElement()))
                    found = true;
                tempAddress = tempAddress.getNext();
            }
        }
        return found;
    }
}
