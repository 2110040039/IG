package day2.oops.question9;

public class Main {
	public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("Alice", 50000);
        System.out.println(employee.toString());  // Print Employee details

        // Create a Manager object
        Manager manager = new Manager("Bob", 70000, "Sales");
        System.out.println(manager.toString());  // Print Manager details

        // Create an Executive object
        Executive executive = new Executive("Charlie", 90000, "Marketing");
        System.out.println(executive.toString());  // Print Executive details
    }

}
//Name: Alice, Salary: 50000.0
//Manager - Name: Bob, Department: Sales, Salary: 70000.0
//Executive - Name: Charlie, Department: Marketing, Salary: 90000.0

