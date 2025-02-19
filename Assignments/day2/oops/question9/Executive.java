package day2.oops.question9;

public class Executive extends Manager{
	public Executive(String name, double salary, String department) {
        super(name, salary, department);  // Call the constructor of Manager class
    }

    // toString method to return Executive's information (with prefix "Executive")
    @Override
    public String toString() {
        return "Executive - Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}
