package CA224.Searching;

public class main {
    public static void main(String[] args) {
        Integer[] marks = { 10 , 100, 90};
        String[] names = { "Ali" , "Gedi", "Hawa"};
        System.out.println(Searching.<String>linearSearch(names , "Ali"));
    }
}
