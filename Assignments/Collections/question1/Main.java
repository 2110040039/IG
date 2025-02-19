package Collections.question1;
import java.util.HashSet;
public class Main {
	    public static void main(String[] args) {
	        // Create Address objects
	        Address address1 = new Address("123 Main St", "New York", "NY", "10001");
	        Address address2 = new Address("456 Elm St", "Los Angeles", "CA", "90001");
	        Address address3 = new Address("123 Main St", "New York", "NY", "10001"); // Same as address1

	        // Create Student objects
	        Student student1 = new Student("John", "Doe", 20, address1);
	        Student student2 = new Student("Jane", "Doe", 21, address2);
	        Student student3 = new Student("John", "Doe", 20, address1); // Same as student1

	        // Create a HashSet to store students
	        HashSet<Student> students = new HashSet<>();

	        // Add students to the HashSet
	        students.add(student1);
	        students.add(student2);
	        students.add(student3); // This should be considered a duplicate and not added

	        // Print all unique students
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
	}


//John Doe (Age: 20) - 123 Main St, New York, NY - 10001
//Jane Doe (Age: 21) - 456 Elm St, Los Angeles, CA - 90001
//
