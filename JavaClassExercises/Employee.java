
//  Problem Statement : 13. Write a program that would print the information (name, year of joining,salary, address) of three employees by creating a class named 'Employee'.
// The output should be as follows:

//  Name     Year of joining        Address
//  Robert     1994              64C- WallsStreat
//  Sam        2000              68D- WallsStreat
//  John       1999              26B- WallsStreat

class Employee {
    private String name;
    private int yearJoining;
    private String address;

    public Employee(String name, int yearJoining, String address) {
        this.name = name;
        this.yearJoining = yearJoining;
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("%-15s%-25d%-15s", this.name, this.yearJoining, this.address);
    }
}

class App {

    public static void main(String[] args) {

        Employee[] employees = { 
                new Employee("Robert", 1994, "64C- WallsStreat"),
                new Employee("Sam", 2000, "68D- WallsStreat"),
                new Employee("John", 1999, "26B- WallsStreat") 
            };

        System.out.printf("%-15s%-25s%-15s\n", "Name", "Year of joining", "Address");

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
}
