// Problem Statement : 6. Write a program to print the area of a rectangle by creating a class named
// 'Area' having two methods. First method named as 'setDim' takes length
// and breadth of rectangle as parameters and the second method named as
// 'getArea' returns the area of the rectangle. Length and breadth of rectangle
// are entered through keyboard.

import java.util.*;

public class Area6 {

    // Declaring the variables .
    private int length , breadth ;

    // Class Method for setting our values .
    public void setDim (int l , int b){
        this.length = l;
        this.breadth = b;
    }

    // Class Method for performing our calculation .
    int getArea (){
        return (this.length*this.breadth);
    }

    public static void main(String[] args) {
        
        // The Scanner is a built-in class in java used for read the input from the user in java programming.
        Scanner scn = new Scanner(System.in);

        System.out.print(" Enter the value of length : ");
        int l = scn.nextInt();
        System.out.print(" Enter the value of breadth : ");
        int b = scn.nextInt();

        // Making our object a1 .
        Area6 a1 = new Area6();  
        a1.setDim(l, b);
        System.out.println("Area of rectangle with your given values is : " + a1.getArea()); // calling method getArea for object a1 .

    }
}

 