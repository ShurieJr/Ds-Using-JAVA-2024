package CA221.Stacks;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();
        s1.push("omar");
        s1.push("gedi");
        s1.push("warsame");
        System.out.println("Stack elements: " + s1);
        System.out.println("Stack sze: " + s1.size());
        System.out.println("isempty: " + s1.isEmpty());
        String removedElement = s1.pop();
        System.out.println("removed element: " + removedElement);
        System.out.println("top element: " + s1.peek());
        System.out.println("Stack sze: " + s1.size());
    }
}
