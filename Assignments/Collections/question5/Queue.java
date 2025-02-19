package Collections.question5;
import java.util.LinkedList;
public class Queue<T> {
	    private LinkedList<T> queue;

	    // Constructor
	    public Queue() {
	        queue = new LinkedList<>();
	    }

	    // Method to add an element to the queue
	    public void enqueue(T element) {
	        queue.addLast(element); // Adds element at the end of the queue (FIFO)
	    }

	    // Method to remove an element from the queue
	    public T dequeue() {
	        if (!isEmpty()) {
	            return queue.removeFirst(); // Removes the first element (FIFO)
	        } else {
	            System.out.println("Queue is empty!");
	            return null;
	        }
	    }

	    // Method to check if the queue is empty
	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }

	    // Method to get the size of the queue
	    public int size() {
	        return queue.size();
	    }

	    // Method to view the first element without removing it
	    public T peek() {
	        if (!isEmpty()) {
	            return queue.getFirst();
	        } else {
	            System.out.println("Queue is empty!");
	            return null;
	        }
	    }

	    // Method to display all elements in the queue
	    public void display() {
	        if (!isEmpty()) {
	            System.out.println("Queue elements: " + queue);
	        } else {
	            System.out.println("Queue is empty!");
	        }
	    }
	}



