package CA224.Searching;

public class Searching <T>{
    public static void main(String[] args) {
        Integer[] marks = { 10 , 90, 100};
        System.out.println(Searching.<Integer>binarySearch(marks , 90));
    }

    //linear search  static - generic
    static <T> boolean linearSearch(T[] data , T target){
        boolean found = false;
        int index = 0;
        while(!found && index <= data.length-1){
           found = target.equals(data[index]);
            index++;
        }
        return found;
    }

    //Binary Search
    static <T extends Comparable<T>> boolean binarySearch(T[] data , T target){
        boolean found = false;
        int low = 0;
        int high = data.length-1;
        while(!found && low <= high){
            int mid = (low + high) / 2;
            if(target.compareTo(data[mid]) == 0)
                found = true;
            else if (target.compareTo(data[mid]) > 0)
                low = mid+1;
            else
                high = mid - 1;
        }
        return found;
    }
}
