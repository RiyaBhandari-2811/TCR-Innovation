// Problem Statemeny : 2. Create a Pet class to represent a Pet type in java, which should have the following fields:
// name: Instance variable of type String that holds the name of a pet.
// animal: Instance variable of type String that holds the type of animal that a
// pet is.
// age: Instance variable of type int holds the pet's age.
// The Pet class should also have the following methods:
// constructor for this class. The constructor should accept an argument for
// each of the fields.
// setName: The setName method stores a value in the name field.
// setAnimal: The setAnimal method stores a value in the animal field.
// setAge: The setAge method stores a value in the age field.
// getName: The getName method returns the value of the name field.
// getAnimal: The getAnimal method returns the value of the animal field.
// getAge: The getAge method returns the value of the age field.

public class Pet {

    private String name ; 
    private String animal ;
    private int age ;
 
    public Pet (){}  // Default Constructor

    // Parameterized Constructor
    public Pet( String name , String animal , int age){
        this.name = name ;
        this.animal = animal ;
        this.age = age;
    }

    // The set method takes a parameter (Name) and assigns it to the name variable. 
    // The this keyword is used to refer to the current object.
    public void setName (String Name){
        this.name = Name;
    }

    public void setAnimal (String Animal){
        this.animal = Animal;
    }
    
    public void setAge (int Age){
        this.age =  Age;
    }

    // Getter returns the value (accessors), it returns the value of data type int, String, double, float, etc.

    public String getName (){
        return this.name ;
    }

    public String getAnimal (){
        return this.animal ;
    }

    public int getAge (){
        return this.age ;
    }

    public static void main(String[] args) {
        
        // Creating Object for class Pet .
        Pet pet1 = new Pet();
        pet1.setName("Lola"); // Initializing using Methods
        pet1.setAnimal("Cat");
        pet1.setAge(5);
        System.out.println(" The Name Of Pet : " + pet1.getName() + " , Animal : " + pet1.getAnimal() + " & Age : " + pet1.getAge());
        
        Pet pet2 = new Pet("Jack","Dog",6); // Creating Object for class Pet & Initializing using Parameterized Constructor
        System.out.println(" The Name Of Pet : " + pet2.getName() + " , Animal : " + pet2.getAnimal() + " & Age : " + pet2.getAge());


    }
}
