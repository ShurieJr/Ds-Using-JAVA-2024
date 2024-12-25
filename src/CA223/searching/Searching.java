package CA223.searching;

public class Searching<T> {
    public static void main(String[] args) {
        Integer[] marks  = {20 , 20 , 100 , 200};
        System.out.println(binarySearch(marks , 20));
    }




    static <T> boolean linearSearch(T[] data , T target){
        boolean found = false;
        int index = 0;
        while(!found && index <= data.length-1){
            found = target.equals(data[index]);
            index++;
        }
        return found;
    }

    //binary search
    static <T extends Comparable<T>> boolean binarySearch(T[] data, T target){
        int low = 0;
        int high = data.length-1;
        boolean found = false;
        while (!found && low <= high){
            int mid = (high  + low)/2;
            if(target.compareTo(data[mid]) == 0)
                found = true;
            else  if(target.compareTo(data[mid]) > 0)
                low = mid+1;
            else
                high = mid-1;
        }
        return found;
    }
}
