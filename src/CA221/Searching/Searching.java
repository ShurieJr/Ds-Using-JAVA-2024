package CA221.Searching;

public class Searching {
    public static void main(String[] args) {
        Integer[] marks = {2,2, 5 , 5 ,5 , 100};
        String[] names = {"Ali" , "warsame","farah"};
        System.out.println(Searching.binarySearch(marks , 5));
    }
    //1. linear search method
    static <T> boolean linearSearch(T[] data, T target){
        boolean found = false;
        int index = 0;
        int max= data.length-1;
        while (!found && index <= max){
            found = target.equals(data[index]);
            index++;
        }
        return found;
    }

    //2.Binary search method
    static <T extends Comparable<T>> int binarySearch(T[] data, T target) {
        boolean found = false;
        int low = 0;
        int high = data.length-1;
        int count = 0;
        while (!found && low <= high){
            int mid =( low + high) / 2 ;
            if(target.compareTo(data[mid]) == 0) {
                //  left
                int left = mid;
                while (left >= 0 && data[left].compareTo(target) == 0) {
                    count++;
                    left--;
                }

                //  right
                int right = mid + 1;
                while (right < data.length && data[right].compareTo(target) == 0) {
                    count++;
                    right++;
                }

                return count; // Return total count
            }
            else if (target.compareTo(data[mid]) > 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return count;
    }
}
