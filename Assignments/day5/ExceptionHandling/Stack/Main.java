package day5.ExceptionHandling.Stack;

public class Main {
	public static void main(String[] args) {
        try {
            // Create stack to store up to 3 contacts
            ContactStack stack = new ContactStack(3);

            // Create Contact objects
            Contact contact1 = new Contact("John", "Middle", "Doe", "01/01/1990", "Male", "1234567890");
            Contact contact2 = new Contact("Jane", "", "Smith", "05/05/1995", "Female", "9876543210");
            Contact contact3 = new Contact("Tom", "Michael", "Jones", "03/03/1992", "Male", "1122334455");
            Contact contact4 = new Contact("Invalid", "", "User", "01/01/2000", "Male", "123");

            // Push valid contacts
            stack.push(contact1);
            stack.push(contact2);
            stack.push(contact3);

            // Try pushing an invalid contact (with an invalid mobile number)
            stack.push(contact4);  // This will fail due to validation

        } catch (StackException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Pop a contact
            ContactStack stack = new ContactStack(3);
            Contact contact1 = new Contact("John", "Middle", "Doe", "01/01/1990", "Male", "1234567890");
            stack.push(contact1);

            // Pop the contact
            stack.pop();

            // Try popping from an empty stack (this will fail)
            stack.pop();  // This will fail as the stack is now empty

        } catch (StackException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

	
	//Contact added: Contact [firstName=John, middleName=Middle, lastName=Doe, dateOfBirth=01/01/1990, gender=Male, mobileNumber=1234567890]
	//Contact added: Contact [firstName=Jane, middleName=, lastName=Smith, dateOfBirth=05/05/1995, gender=Female, mobileNumber=9876543210]
	//Contact added: Contact [firstName=Tom, middleName=Michael, lastName=Jones, dateOfBirth=03/03/1992, gender=Male, mobileNumber=1122334455]
	//Error: Invalid contact! Cannot push to stack.
	//Contact removed: Contact [firstName=Tom, middleName=Michael, lastName=Jones, dateOfBirth=03/03/1992, gender=Male, mobileNumber=1122334455]
	//Error: Stack is empty! Cannot pop.
	//

}
