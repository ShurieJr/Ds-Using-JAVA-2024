package CA224;

public class Main {
    public static void main(String[] args) {
        //create object from Circle
        Circle myCircle = new Circle(3);
        System.out.println("radius: " + myCircle.radius);
        System.out.println("Area : "  + myCircle.getArea());

        System.out.println(myCircle.toString());
    }
}
