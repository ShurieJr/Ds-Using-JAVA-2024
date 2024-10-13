package CA221.Generics;

public class Student<T> {  // T placeholder
    T data1;
    T data2;


    //mani method
    public static void main(String[] args) {
        Student<Integer > s1 = new Student<>();
        Student<String > s2 = new Student<>();
        Student<Boolean> s3 = new Student<>();
        s1.data1 = 10;
        s1.data2 = 12;

    }
}
