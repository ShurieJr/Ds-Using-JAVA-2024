package CA221;
public class Circle {
    //variables
    double radius;  //instance variable
    static int numberOfObjects; //static variable
    //Constructors
    //-> No argument constructor
    Circle(){
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
    public void setRadius(double value) {
        radius = value;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
