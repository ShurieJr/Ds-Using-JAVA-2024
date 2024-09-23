package CA223;

public class Main {
    public static void main(String[] args) {
        //create object from Circle class
        Circle myCircle = new Circle();
        //myCircle.setRadius(10);
        //myCircle.radius = 10;
        System.out.println("Radius: " + myCircle.radius);
        System.out.println("Area: " + myCircle.getArea());
        System.out.println("---------------------------");

        //create object2 from Circle class
        Circle yourCircle = new Circle(4);
        Circle ourCircle = new Circle(48);
        System.out.println("Radius: " + yourCircle.radius);
        System.out.println("Area: " + yourCircle.getArea());

        myCircle.numberOfObjects = 10;

        System.out.println("Number of objects (class): " + Circle.numberOfObjects);
        System.out.println("Number of objects (mycircle): " + myCircle.numberOfObjects);
        System.out.println("Number of objects (yourcircle): " + yourCircle.numberOfObjects);



    }

    //method
   static int calculateMarks(){
        return 5+5;
    }
}
