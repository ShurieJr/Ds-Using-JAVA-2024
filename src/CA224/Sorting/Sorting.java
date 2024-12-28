package CA224.Sorting;

public class Sorting {


    public static void main(String[] args) {
        int[] marks = {100, 10, 50, 40};
        System.out.println("Unsorted:");
        for (int num : marks) {
            System.out.println(num);
        }

        selectionSort(marks);
        System.out.println("sorted:");
        for (int num : marks) {
            System.out.println(num);
        }

    }

    //selection sort

    static void selectionSort(int[] data) {
        int size = data.length;
        int min;
        for (int index = 0; index < size - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < size; scan++) {
                if (data[scan] < data[min]) {
                    min = scan;
                }
                //swap
                int temp = data[min];
                data[min] = data[index];
                data[index] = temp;
            }
        }
    }
}
