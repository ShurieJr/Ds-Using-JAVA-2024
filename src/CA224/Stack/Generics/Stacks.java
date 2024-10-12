package CA224.Stack.Generics;

import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);

       int removedElement  = s1.pop();
        System.out.println("removed element: " + removedElement);
        System.out.println("top element: " + s1.peek());
        System.out.println("size: " + s1.size());
        s1.pop();
        s1.pop();
        System.out.println("size: " + s1.size());
        System.out.println("IsEmpty(): " + s1.isEmpty());

    }
}
