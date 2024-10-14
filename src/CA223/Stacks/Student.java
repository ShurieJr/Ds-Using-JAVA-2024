package CA223.Stacks;

public class Student<R> {
    R data;
    int age;

    //main
    public static void main(String[] args) {
        Student<String> strobj = new Student<String>();
        Student<Integer> intobj = new Student<>();
        Student<Boolean> boolobj = new Student<>();
        strobj.data = "Mohamed";
        strobj.age = 90;
        intobj.data = 100;
        boolobj.data = true;
    }
}
