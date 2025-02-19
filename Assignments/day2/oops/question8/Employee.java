package day2.oops.question8;
	abstract class Employee {
	    // Attributes of the Employee class
	    int empid;
	    String empname;

	    // Concrete method to input employee details
	    public void input(int empid, String empname) {
	        this.empid = empid;
	        this.empname = empname;
	    }

	    // Concrete method to display employee details
	    public void output() {
	        System.out.println("Employee ID: " + empid);
	        System.out.println("Employee Name: " + empname);
	    }

	    // Abstract method to define roles and responsibilities
	    public abstract void roles_Responsibilities();
	}

	// Manager class that extends Employee
	class Manager extends Employee {

	    // Override the abstract method
	    @Override
	    public void roles_Responsibilities() {
	        System.out.println(empname + " is responsible for overseeing the team, managing projects, and ensuring deadlines are met.");
	    }
	}

	



