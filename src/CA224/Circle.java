package CA224;

public class Circle {
    //variables
    double radius;
    //constructors
    Circle(){
        radius = 1.0;
    }
    Circle(double newRadius){
        radius = newRadius;
    }
    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }

    //main method

}
