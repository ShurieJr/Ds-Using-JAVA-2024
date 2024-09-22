package CA221;

public class Main {
    public static void main(String[] args) {
        //create object from Circle class
//        Circle obj1 = new Circle();
//        Circle obj2 = new Circle(5);
//
//        System.out.println("radius: " + obj1.radius);
//        System.out.println("Area : " + obj1.getArea());

        //System.out.println(obj1.toString());

        // create object from Student class
//        Student std = new Student();
//
//        System.out.println("Name: " + std.name);
//        System.out.println("Age: " + std.age);
//        System.out.println("Score: " + std.score);
//        System.out.println("Status: " + std.status);
//        System.out.println("Gender: " + std.gender);


//        int score = 0 ;  //local variable
//        System.out.println(score);

        //Class Circle  --   instance & static

        System.out.println("Before object creation: " + Circle.numberOfObjects);
        Circle c1 = new Circle();
        Circle c2 = new Circle(7.1);
        Circle c3 = new Circle(6.1);

        System.out.println("After object creation (class) : " + Circle.getNumberOfObjects());
        System.out.println("After object creation (c1) : " + c1.getNumberOfObjects());
        System.out.println("After object creation (c2) : " + c2.getNumberOfObjects());

        System.out.println(c1.radius);
        System.out.println(c2.radius);
    }
}
