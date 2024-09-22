package CA221;

public class test {
    public static void main(String[] args) {
        //object 1
        Student s1 = new Student();
        s1.name = "Omar";
        Student s2 = new Student();

        s2 = s1;
        s2.name = "Mohamed";

        System.out.println(s1.toString());
        System.out.println(s2.toString());

        System.out.println("S1 (name) : " + s1.name);
        System.out.println("S2 (name) : " + s2.name);
    }
}
