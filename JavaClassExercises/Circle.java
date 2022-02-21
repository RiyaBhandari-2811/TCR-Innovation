
// Problem Statement : 1. Create a Circle class to represent a Circle type in java, which should have
// following :
// -> radius. Instance field of type double
// -> No-argument constructor. Set radius with default value of 1.0
// -> Constructor. that accept an argument for radius
// -> getRadius. public method that returns the radius of Circle
// -> getArea. Method that returns the area of Circle

package JavaClassExercises;

public class Circle {

    private double radius ;
    private double PI = 3.14 ;

    public Circle(){
        this.radius = 1.0 ;
    }

    public Circle (double r) {
        this.radius = r ;
    }

    public double getRadius () {
        return this.radius ;
    }

    public double getArea () {
        
        return Math.round(PI*this.radius*this.radius) ;
    }

    public static void main(String[] args) {

        Circle c1 = new Circle(2.0);
        System.out.println( "Radius of Circle : " + c1.getRadius());
        System.out.println( "Area of Circle :" + c1.getArea());
        
    }
    
}
