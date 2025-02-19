package Collections.question5;

public class Main {
	    public static void main(String[] args) {
	        // Testing Queue with Integers
	        Queue<Integer> integerQueue = new Queue<>();
	        integerQueue.enqueue(10);
	        integerQueue.enqueue(20);
	        integerQueue.enqueue(30);
	        integerQueue.display(); // Output: Queue elements: [10, 20, 30]
	        
	        System.out.println("Dequeue: " + integerQueue.dequeue()); // Output: Dequeue: 10
	        integerQueue.display(); // Output: Queue elements: [20, 30]
	        
	        // Testing Queue with Floats
	        Queue<Float> floatQueue = new Queue<>();
	        floatQueue.enqueue(10.5f);
	        floatQueue.enqueue(20.3f);
	        floatQueue.enqueue(30.7f);
	        floatQueue.display(); // Output: Queue elements: [10.5, 20.3, 30.7]
	        
	        System.out.println("Dequeue: " + floatQueue.dequeue()); // Output: Dequeue: 10.5
	        floatQueue.display(); // Output: Queue elements: [20.3, 30.7]
	        
	        // Testing Queue with Doubles
	        Queue<Double> doubleQueue = new Queue<>();
	        doubleQueue.enqueue(100.5);
	        doubleQueue.enqueue(200.3);
	        doubleQueue.enqueue(300.9);
	        doubleQueue.display(); // Output: Queue elements: [100.5, 200.3, 300.9]
	        
	        System.out.println("Dequeue: " + doubleQueue.dequeue()); // Output: Dequeue: 100.5
	        doubleQueue.display(); // Output: Queue elements: [200.3, 300.9]
	        
	        // Testing Queue with Objects (Strings)
	        Queue<String> stringQueue = new Queue<>();
	        stringQueue.enqueue("Apple");
	        stringQueue.enqueue("Banana");
	        stringQueue.enqueue("Cherry");
	        stringQueue.display(); // Output: Queue elements: [Apple, Banana, Cherry]
	        
	        System.out.println("Dequeue: " + stringQueue.dequeue()); // Output: Dequeue: Apple
	        stringQueue.display(); // Output: Queue elements: [Banana, Cherry]
	    }
	}


//Queue elements: [10, 20, 30]
//Dequeue: 10
//Queue elements: [20, 30]
//
//Queue elements: [10.5, 20.3, 30.7]
//Dequeue: 10.5
//Queue elements: [20.3, 30.7]
//
//Queue elements: [100.5, 200.3, 300.9]
//Dequeue: 100.5
//Queue elements: [200.3, 300.9]
//
//Queue elements: [Apple, Banana, Cherry]
//Dequeue: Apple
//Queue elements: [Banana, Cherry]

