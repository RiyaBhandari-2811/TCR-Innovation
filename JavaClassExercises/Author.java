
// Problem Statement : 4. Write a Java class Author with following features:
// Instance variables :
//      firstName for the author’s first name of type String.
//       lastName for the author’s last name of type String.
// Constructor:
//      public Author (String firstName, String lastName): A constructor with
//      parameters, it creates the Author object by setting the two fields to the passed
//      values.
// Instance methods:
//      Create AuthoInfo() method 

public class Author {

    private String firstName , lastName ;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void AuthoInfo(){
        System.out.println(" The Name of Author : " + this.firstName +" "+ this.lastName);
    }

    public static void main(String[] args) {
        Author a1 = new Author ("William" ," Shakespeare ");
        a1.AuthoInfo();
    }

}
