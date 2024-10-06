package CA221;
public class Circle {
    //variables
   private double radius;  //instance variable
   private static int numberOfObjects; //static variable
    //Constructors
    //-> No argument constructor


     Circle() {
         radius = 1.0;
         numberOfObjects++;
    }

    //-> Constructor with arguments
    Circle(double newradius){
        radius = newradius;
        numberOfObjects++;
    }
    //methods
    double getArea() {  //instance method

        return radius * radius * Math.PI;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }
//get & set methods

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
