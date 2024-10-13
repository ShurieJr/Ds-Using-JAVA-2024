package CA221.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Reverser {
    String reverse(String input){
        //step 1: push
        Stack<Character> s1 = new Stack<Character>();

        for(int i = 0; i < input.length(); i++){
            s1.push(input.charAt(i));
        }
        //step 2: pop
        //String result= "";
        StringBuffer reversed = new StringBuffer();
        while(!s1.isEmpty()){
            //result += s1.pop();
            reversed.append(s1.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Reverser test = new Reverser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to reverse: ");
        String text = scanner.next();

        System.out.println("Reversed text : " + test.reverse(text));
    }
}
