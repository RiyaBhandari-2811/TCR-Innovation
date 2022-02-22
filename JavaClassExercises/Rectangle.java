
// Problem Statement 9. Write a program to print the area of two rectangles having sides (4,5) and
//(5,8) respectively by creating a class named 'Rectangle' with a method
//named 'Area' which returns the area and length and breadth passed as
//parameters to its constructor.

// package JavaClassExercises;

public class Rectangle {

    // Declaring the variables .
    private int length , breadth ;

    // Class Parametrize Constructor for initialize variables  .
    // this keyword is reference variable that refers to the current object .
    Rectangle(int l , int b){
        this.length = l;
        this.breadth = b;
    }

    // Class Method for performing our calculation .
    public int Area (){
        return (this.length*this.breadth) ;
    }

    public static void main(String[] args) {

        // Making our object r1 .
        Rectangle r1 = new Rectangle(4,5);
        System.out.println("Area of rectangle with sides (4,5) is : " + r1.Area()); // calling method Area for object a1 .

        // Making our object r2 .
        Rectangle r2 = new Rectangle(5,8);
        System.out.println("Area of rectangle with sides (5,8) is : " + r2.Area()); // calling method Area for object a1 .

    }
}
