import java.util.Scanner;

// Problem Statement : 12. Print the sum, difference and product of two complex numbers by
// creating a class named 'Complex' with separate methods for each
// operation whose real and imaginary parts are entered by user

public class Complex {
    private int x,y;

    public Complex() {
    }

    public Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Created method with type Complex and it is taking arguments of type Complex
    Complex add (Complex a){
        Complex c = new Complex();
        c.x = x + a.x;
        c.y = y + a.y;
        return c ;
    }

    Complex diff (Complex a){
        Complex c = new Complex();
        c.x = x - a.x;
        c.y = y - a.y;
        return c ;
    }

    Complex product (Complex a){
        Complex c = new Complex();
        c.x = x * a.x;
        c.y = y * a.y;
        return c ;
    }

    void display (){
        if(y>=0)
        System.out.println(x + " + i" + y);
        else
        System.out.println(x + " " + y + "i");
    }

    public static void main(String[] args) {
        
        int a , b ;
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter real and imaginary part of a complex number : ");
        a=scn.nextInt();
        b=scn.nextInt();

        Complex c1 = new Complex(a,b);
        
        System.out.println(" Enter real and imaginary part of another complex number : ");
        a=scn.nextInt();
        b=scn.nextInt();

        Complex c2 = new Complex(a,b);

        Complex c3 = new Complex();
        System.out.println(" **** Addition **** ");
        c3=c1.add(c2);
        c3.display();
        
        System.out.println(" **** Difference **** ");
        c3=c1.diff(c2);
        c3.display();
        
        System.out.println(" **** Product **** ");
        c3=c1.product(c2);
        c3.display();

    }
}
