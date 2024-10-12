package CA224.Stack.Generics;

public class Box<T> {  //placeholder
    T data;  // generic type
    T data2;  // generic type

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();

        box1.data = "Ali";
        box1.data2 = "Abdullahi";

    }
}
