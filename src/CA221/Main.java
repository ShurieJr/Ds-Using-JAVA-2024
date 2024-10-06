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

        //Class Circle  --   instance & static
        //System.out.println("Before object creation: " + Circle.numberOfObjects);
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.1);
        Circle c3 = new Circle(3.1);
        //method calling
        printCircle(c1,c2 ,c3);
        printCircle(c1,c2 ,c3);
        printCircle(c1,c2 ,c3);
    }
    static void printCircle(Circle obj , Circle obj2 , Circle obj3){
        System.out.println("object 1 -------------------------------");
        System.out.println(obj.getRadius());
        System.out.println(obj.getArea());
        System.out.println("object 2 -------------------------------");
        System.out.println(obj2.getRadius());
        System.out.println(obj2.getArea());
        System.out.println("object 3 -------------------------------");
        System.out.println(obj3.getRadius());
        System.out.println(obj3.getArea());
    }

}
