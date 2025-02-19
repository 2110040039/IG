package Collections.question4;
import java.util.*;
public class Main {
	    public static void main(String[] args) {
	        // Creating a TreeSet to store Employees
	        Set<Employee> employeeSet = new TreeSet<>();

	        // Adding Employees
	        employeeSet.add(new Employee(101, "John", "Doe"));
	        employeeSet.add(new Employee(102, "Alice", "Smith"));
	        employeeSet.add(new Employee(103, "Bob", "Johnson"));
	        employeeSet.add(new Employee(104, "Charlie", "Brown"));
	        employeeSet.add(new Employee(105, "Eve", "Davis"));
	        employeeSet.add(new Employee(106, "Alice", "Williams"));  // Duplicate first name

	        // Displaying Employees sorted by empid (default sorting using Comparable)
	        System.out.println("Employees sorted by empid:");
	        for (Employee emp : employeeSet) {
	            System.out.println(emp);
	        }

	        // Sorting Employees by firstname using Comparator
	        Set<Employee> sortedByFirstName = new TreeSet<>(Employee.sortByFirstName);
	        sortedByFirstName.addAll(employeeSet);

	        System.out.println("\nEmployees sorted by firstname:");
	        for (Employee emp : sortedByFirstName) {
	            System.out.println(emp);
	        }
	    }
	}


//Employees sorted by empid:
//Employee{empid=101, firstname='John', lastname='Doe'}
//Employee{empid=102, firstname='Alice', lastname='Smith'}
//Employee{empid=103, firstname='Bob', lastname='Johnson'}
//Employee{empid=104, firstname='Charlie', lastname='Brown'}
//Employee{empid=105, firstname='Eve', lastname='Davis'}
//Employee{empid=106, firstname='Alice', lastname='Williams'}
//
//Employees sorted by firstname:
//Employee{empid=103, firstname='Bob', lastname='Johnson'}
//Employee{empid=104, firstname='Charlie', lastname='Brown'}
//Employee{empid=101, firstname='John', lastname='Doe'}
//Employee{empid=102, firstname='Alice', lastname='Smith'}
//Employee{empid=106, firstname='Alice', lastname='Williams'}
//Employee{empid=105, firstname='Eve', lastname='Davis'}

