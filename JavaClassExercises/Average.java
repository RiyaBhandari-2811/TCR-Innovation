
//Problem Statement : 11.Print the average of three numbers entered by user by creating a class
//                    named 'Average' having a method to calculate and print the average.

package JavaClassExercises;

import java.util.Scanner;

public class Average {

    // Declaring the variables .
    public int num1 , num2 , num3 ;

    // The Scanner is a built-in class in java used for read the input from the user in java programming.
    Scanner scn = new Scanner(System.in);

    // Class Constructor for taking input from users and initialize them .
    // this keyword is reference variable that refers to the current object .
    Average(){
        System.out.print("Enter the value of num1 num2 num3 : ");
        this.num1 = scn.nextInt();
        this.num2 = scn.nextInt();
        this.num3 = scn.nextInt();
    }

    // Class Method for performing our calculation .
    public void calculate(){
        int ans = (this.num1+this.num2+this.num3)/3 ;
        System.out.println("Average of entered values is : " + ans );
    }

    public static void main(String[] args) {

        Average a1 = new Average();  // Making our object a1 .
        a1.calculate(); // calling method calculate for object a1 .

    }
}
