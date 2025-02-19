package day5.ExceptionHandling.Stack;

public class ContactStack {
	private Contact[] stack;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack with a given size
    public ContactStack(int size) {
        this.maxSize = size;
        this.stack = new Contact[size];
        this.top = -1;
    }

    // Push method to add a Contact to the stack
    public void push(Contact contact) throws StackException {
        if (top == maxSize - 1) {
            throw new StackException("Stack is full! Cannot push a new contact.");
        }
        if (contact == null || !contact.validate()) {
            throw new StackException("Invalid contact! Cannot push to stack.");
        }
        stack[++top] = contact;
        System.out.println("Contact added: " + contact);
    }

    // Pop method to remove a Contact from the stack
    public Contact pop() throws StackException {
        if (top == -1) {
            throw new StackException("Stack is empty! Cannot pop.");
        }
        Contact poppedContact = stack[top--];
        System.out.println("Contact removed: " + poppedContact);
        return poppedContact;
    }

    // Peek method to view the top Contact without removing it
    public Contact peek() {
        if (top == -1) {
            return null;
        }
        return stack[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }
}



