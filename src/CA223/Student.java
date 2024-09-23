package CA223;

public class Student {
    //variables
    String name;     // null
    int age;         // 0
    boolean isPartTime;  //false
    char gender;   // null character \u0000
    double marks;   // 0.0



    //main
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Mohamed Ali";

        student2 = student1;
        student2.name ="Geedi";

        System.out.println("Name (s1): " + student1.name);
        System.out.println("Name (s2): " + student2.name);

        System.out.println("Student1 address: " + student1.toString());
        System.out.println("Student2 address: " + student2.toString());
//        System.out.println("Age: " + student1.age);
//        System.out.println("IsPartTime: " + student1.isPartTime);
//        System.out.println("Marks: " + student1.marks);
//        System.out.println("gender: " + student1.gender);


    }
}
