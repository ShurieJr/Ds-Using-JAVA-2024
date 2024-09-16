package CA221;
public class Circle {
    //variables
    double radius;
    //Constructors
    //-> No argument constructor
    Circle(){
        radius = 1.0;
    }
    //-> Constructor with arguments
    Circle(double newradius){
        radius = newradius;
    }
    //methods
    double getArea() {
        return radius * radius * Math.PI;
    }
    public void setRadius(double value) {
        radius = value;
    }
}
