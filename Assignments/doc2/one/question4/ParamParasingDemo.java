package doc2.one.question4;

public class ParamParasingDemo {
	    public static void main(String[] args) {
	        // Initialize an int, a Student object, and a String
	        int num = 10;
	        Student student = new Student(101, "John");
	        String name = "Doe";

	        // Print the initial values before modification
	        System.out.println("Before modification:");
	        System.out.println("Integer value: " + num);
	        student.printStudentInfo();  // Display student details
	        System.out.println("String value: " + name);

	        // Call the overloaded modify() methods
	        modify(num);        // Pass primitive type (int)
	        modify(student);    // Pass User-defined class (Student)
	        modify(name);       // Pass String

	        // Print the values after modification
	        System.out.println("\nAfter modification:");
	        System.out.println("Integer value: " + num);  // num will remain the same
	        student.printStudentInfo();  // Student roll number will be incremented
	        System.out.println("String value: " + name);  // name will remain the same
	    }

	    // Method to modify primitive int
	    public static void modify(int num) {
	        num = num + 1;  // Increment the number by 1
	    }

	    // Method to modify Student object
	    public static void modify(Student student) {
	        student.modify(student);  // Increment the roll number of student by 1
	    }

	    // Method to modify String
	    public static void modify(String name) {
	        name = "Changed Name";  // Modify the String value locally
	    }
	}


//Before modification:
//Integer value: 10
//Roll No: 101, Name: John
//String value: Doe
//
//After modification:
//Integer value: 10
//Roll No: 102, Name: John
//String value: Doe

