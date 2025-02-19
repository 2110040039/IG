package day2.oops.question5;

public class Main {
		    public static void main(String[] args) {
		        // Creating a Student object
		        Student student = new Student();

		        // Setting student details
		        student.setStudDetails(101, "John Doe", 85, 90, 88);

		        // Finding the total marks
		        student.findTotal();

		        // Displaying student details
		        System.out.println("Student Details:");
		        student.dispStudDetails();
		    }
		}

//Student Details:
//Roll No: 101
//Name: John Doe
//Total Marks: 263


