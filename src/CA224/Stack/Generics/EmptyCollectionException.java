package CA224.Stack.Generics;

public class EmptyCollectionException
        extends RuntimeException{
    public EmptyCollectionException(String collection) {
        super("The " + collection + " is Empty!");
    }
}
