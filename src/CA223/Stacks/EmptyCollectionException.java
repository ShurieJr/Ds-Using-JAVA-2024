package CA223.Stacks;

public class EmptyCollectionException extends RuntimeException {
    EmptyCollectionException(String collectionName){
        super("The " + collectionName + " is empty!");
    }
}
