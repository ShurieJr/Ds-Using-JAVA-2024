package CA224;

public class Circle {
    //variables
    double radius; // instance variable
    static  int numberOfObjects; // static variable
    //constructors
    Circle(){
        radius = 1.0;
        numberOfObjects++;
    }
    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }
    //methods
    double getArea(){
        return radius * radius * Math.PI;
    }
   static int getNumberOfObjects(){
        return numberOfObjects;
    }

    //main method

}
