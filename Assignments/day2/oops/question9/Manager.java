package day2.oops.question9;

public class Manager extends Employee{
	    // Instance variable for department
	    String department;

	    // Constructor to initialize name, salary and department
	    public Manager(String name, double salary, String department) {
	        super(name, salary);  // Call the constructor of Employee class
	        this.department = department;
	    }

	    // toString method to return Manager's information (name, department, salary)
	    @Override
	    public String toString() {
	        return "Manager - Name: " + name + ", Department: " + department + ", Salary: " + salary;
	    }
	}



