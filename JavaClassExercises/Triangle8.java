
// Problem Statement : 8. Write a program to print the area and perimeter of a triangle having sides
// of 3, 4 and 5 units by creating a class named 'Triangle' with constructor
// having the three sides as its parameters.

// package JavaClassExercises;

public class Triangle8 {

    // Declaring the variables .
    public int side1  , side2 , side3 ;

    // Class Constructor for initialize variables  .
    // this keyword is reference variable that refers to the current object .
    Triangle8 (int s1 , int s2 , int s3){
        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    // Class Method for performing our calculation .
    public void calculate () {
        int perimeter = this.side1 + this.side2 + this.side3 ;
        int semiperimeter = perimeter/2 ;
        double area = Math.round(Math.sqrt(semiperimeter * (semiperimeter-side1) * (semiperimeter-side2) * (semiperimeter-side3)));

        System.out.println (" Area of triangle : " + area + " Perimeter of triangle : " + perimeter);
    }

    public static void main(String[] args) {

        // Making our object t1 .
        Triangle8 t1 = new Triangle8(3,4,5);
        t1.calculate(); // calling method calculate for object t1 .
    }
}
