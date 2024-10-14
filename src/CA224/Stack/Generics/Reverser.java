package CA224.Stack.Generics;

import java.util.Scanner;
import java.util.Stack;

public class Reverser {
    static String reverse(String input) {
        Stack<Character> s1 = new Stack<Character>();
        //step 1: push
        for (int i = 0; i < input.length(); i++) {
            s1.push(input.charAt(i));
        }
        //step 2: pop
        String result = "";
        while (!s1.isEmpty()) {
            result += s1.pop();
        }
        return result;
    }

    static String reverseBuffer(String input) {
        Stack<Character> s1 = new Stack<Character>();
        //step 1: push

        for(char letter: input.toCharArray()){
            s1.push(letter);
        }
        //step 2: pop
        StringBuffer result = new StringBuffer();
        while (!s1.isEmpty()) {
            result.append(s1.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to reverse: ");
        String input = scanner.next();

        System.out.println("Reversed text: " + reverseBuffer(input));
    }
}
