/**
 *
 * FIRST, COMPLETE Shape interface
 * THEN, COMPLETE Rectangle, Square, and Circle classes
 * LASTLY, COMPLETE TestShapes class
 */

//implement Shape interface and provide abstract method implementation
public class Rectangle implements Shape{

    /*
    Define instance variables of rectangle as below
    Instance variables must be encapsulated
    double width
    double height
     */


    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    /*
    Override area and perimeter methods here
    REMEMBER:
    Area of a rectangle can be found as => width * height
    Perimeter of a rectangle can be found as => 2 * (width + height)
    */

    @Override
    public double area(double a) {
        return 0;
    }

    @Override
    public double perimeter(double p) {
        return 0;
    }



    //Override toString() method here

}
