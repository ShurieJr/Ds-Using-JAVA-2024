package CA223;
public class Circle {
    //variables
    double radius;

    //Constructors
    //->No argument constructor
    Circle(){
        radius = 1.0;
    }
    //-> constructor with arguments
    Circle(double newRadius){
        radius = newRadius;
    }

    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }
   void setRadius(double value) {
        radius = value;
    }
}
