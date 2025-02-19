package day2.oops.question5;

public class Student {
	    // Attributes of the Student class
	    private int rollNo;
	    private String name;
	    private int mark1;
	    private int mark2;
	    private int mark3;
	    private int total;

	    // Method to set student details
	    public void setStudDetails(int rollNo, String name, int mark1, int mark2, int mark3) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.mark1 = mark1;
	        this.mark2 = mark2;
	        this.mark3 = mark3;
	    }

	    // Method to calculate total marks
	    public void findTotal() {
	        total = mark1 + mark2 + mark3;  // Sum of the marks
	    }

	    // Method to display student details
	    public void dispStudDetails() {
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Total Marks: " + total);
	    }
	}

	


