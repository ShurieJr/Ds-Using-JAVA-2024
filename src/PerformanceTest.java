import java.util.Stack;

public class PerformanceTest {
    public static void main(String[] args) {
        String text = "This is a long string for performance testing. We want to reverse it.";

        long startTime, endTime;

        // Testing with String
        startTime = System.nanoTime();
        reverseWithString(text);
        endTime = System.nanoTime();
        System.out.println("Time taken with String: " + (endTime - startTime) + " ns");

        // Testing with StringBuffer
        startTime = System.nanoTime();
        reverseWithStringBuffer(text);
        endTime = System.nanoTime();
        System.out.println("Time taken with StringBuffer: " + (endTime - startTime) + " ns");

        // Testing with StringBuilder
        startTime = System.nanoTime();
        reverseWithStringBuilder(text);
        endTime = System.nanoTime();
        System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ns");
    }

    // Reverse with String (Inefficient for large strings)
    public static String reverseWithString(String text) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            characterStack.push(text.charAt(i));
        }

        String reversed = "";
        while (!characterStack.isEmpty()) {
            reversed += characterStack.pop(); // This creates a new String object each time
        }
        return reversed;
    }

    // Reverse with StringBuffer (Thread-safe, slightly slower than StringBuilder)
    public static String reverseWithStringBuffer(String text) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            characterStack.push(text.charAt(i));
        }

        StringBuffer reversed = new StringBuffer();
        while (!characterStack.isEmpty()) {
            reversed.append(characterStack.pop());
        }
        return reversed.toString();
    }

    // Reverse with StringBuilder (Fastest for single-threaded applications)
    public static String reverseWithStringBuilder(String text) {
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            characterStack.push(text.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!characterStack.isEmpty()) {
            reversed.append(characterStack.pop());
        }
        return reversed.toString();
    }

}
