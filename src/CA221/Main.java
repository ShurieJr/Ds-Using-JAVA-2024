package CA221;

public class Main {
    public static void main(String[] args) {
        //create object from Circle class
        Circle obj1 = new Circle();
        Circle obj2 = new Circle(5);

        System.out.println("radius: " + obj1.radius);
        System.out.println("Area : " + obj1.getArea());

        //System.out.println(obj1.toString());
    }
}
