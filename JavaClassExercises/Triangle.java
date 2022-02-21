
// Problem Statement : 7. Write a program to print the area and perimeter of a triangle having sides
                    // of 3, 4 and 5 units by creating a class named 'Triangle' without any
                    // parameter in its constructor.
//Area= √	p(p	−a) (p−b) (p−c) //(Heron’s Formula) ( p = semiperimeter)
// perimeter = a + b + c

package JavaClassExercises;

public class Triangle {

    // Declaring the variables .
    public int side1  , side2 , side3 ;

    // Class Constructor for initialize variables  .
    // this keyword is reference variable that refers to the current object .
    Triangle (){
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
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
        Triangle t1 = new Triangle();
        t1.calculate(); // calling method calculate for object t1 .
    }
}
