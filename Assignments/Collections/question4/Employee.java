package Collections.question4;
import java.util.*;
public class Employee implements Comparable<Employee> {
	    private int empid;
	    private String firstname;
	    private String lastname;

	    // Constructor
	    public Employee(int empid, String firstname, String lastname) {
	        this.empid = empid;
	        this.firstname = firstname;
	        this.lastname = lastname;
	    }

	    // Getters and Setters
	    public int getEmpid() {
	        return empid;
	    }

	    public void setEmpid(int empid) {
	        this.empid = empid;
	    }

	    public String getFirstname() {
	        return firstname;
	    }

	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }

	    public String getLastname() {
	        return lastname;
	    }

	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }

	    @Override
	    public String toString() {
	        return "Employee{empid=" + empid + ", firstname='" + firstname + "', lastname='" + lastname + "'}";
	    }

	    // Implementing Comparable to sort by empid
	    @Override
	    public int compareTo(Employee other) {
	        return Integer.compare(this.empid, other.empid);
	    }

	    // Comparator to sort by firstname
	    public static Comparator<Employee> sortByFirstName = new Comparator<Employee>() {
	        @Override
	        public int compare(Employee emp1, Employee emp2) {
	            return emp1.firstname.compareTo(emp2.firstname);
	        }
	    };
	}



