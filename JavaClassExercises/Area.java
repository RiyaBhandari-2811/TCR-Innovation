
//Problem Statement : 10. Write a program to print the area of a rectangle by creating a class
//         named 'Area' taking the values of its length and breadth as parameters of
//        its constructor and having a method named 'returnArea' which returns the
//        area of the rectangle. Length and breadth of rectangle are entered through
//        keyboard.

// package JavaClassExercises;

import java.util.Scanner;

public class Area {

    // Declaring the variables .
    private int length , breadth ;

    // The Scanner is a built-in class in java used for read the input from the user in java programming.
    Scanner scn = new Scanner(System.in);

    // Class Constructor for taking input from users and initialize them .
    // this keyword is reference variable that refers to the current object .
    Area (){
        System.out.print(" Enter the value of length : ");
        this.length = scn.nextInt();
        System.out.print(" Enter the value of breadth : ");
        this.breadth = scn.nextInt();
    }

    // Class Method for performing our calculation .
    int returnArea (){
        return (this.length*this.breadth);
    }

    public static void main(String[] args) {

        Area a1 = new Area();  // Making our object a1 .
        System.out.println("Area of rectangle with your given values is : " + a1.returnArea()); // calling method returnArea for object a1 .

    }
}
