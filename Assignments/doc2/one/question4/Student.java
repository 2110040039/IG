package doc2.one.question4;

public class Student {
	    int rollno;
	    String fname;

	    // Constructor 
	    public Student(int rollno, String fname) {
	        this.rollno = rollno;
	        this.fname = fname;
	    }

	    // a. Modify the integer (primitive)
	    public void modify(int num) {
	        num = num + 1;
	    }

	    // b. Modify the Student object (user-defined class)
	    public void modify(Student student) {
	        student.rollno = student.rollno + 1;
	    }

	    // c. Modify the String (fname)
	    public void modify(String name) {
	        name = "New Name";  // This modification will not reflect outside this method
	    }

	    // Method to print student details
	    public void printStudentInfo() {
	        System.out.println("Roll No: " + rollno + ", Name: " + fname);
	    }
	}


