package CA221.Stacks;

public class EmptyCollectionException extends RuntimeException{
    EmptyCollectionException(String collection){
        super("The " + collection + " is empty!");
    }
}
