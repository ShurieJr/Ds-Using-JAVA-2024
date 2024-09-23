package CA223;

 class Circle {
    //variables
    double radius;  //instance variable
    static int numberOfObjects; //static variable

    //Constructors
    //->No argument constructor
    Circle() {
        radius = 1.0;
        numberOfObjects++;
    }

    //-> constructor with arguments
    Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    //methods
    double getArea() {
        return radius * radius * Math.PI;
    }

    void setRadius(double value) {
        radius = value;
    }
    //Static methods
    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    void display(){
        numberOfObjects = 2; // static variable
        getNumberOfObjects(); // static method

        getArea(); // instance method
        radius = 6; //instance variable
    }

}
