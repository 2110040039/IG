package Collections.question1;
import java.util.Objects;
public class Student {
	    private String firstName;
	    private String lastName;
	    private int age;
	    private Address address;

	    public Student(String firstName, String lastName, int age, Address address) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.age = age;
	        this.address = address;
	    }

	    // Getters and Setters
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public Address getAddress() {
	        return address;
	    }

	    public void setAddress(Address address) {
	        this.address = address;
	    }

	    // Combining first name and last name as full name for comparison
	    public String getFullName() {
	        return firstName + " " + lastName;
	    }

	    // Override equals and hashCode to compare based on full name and address
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Student student = (Student) obj;
	        return getFullName().equals(student.getFullName()) && address.equals(student.address);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(getFullName(), address);
	    }

	    @Override
	    public String toString() {
	        return getFullName() + " (Age: " + age + ") - " + address;
	    }
	}



