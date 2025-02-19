package day2.oops;


	public class Q12Tree {
		    // Static variable to count instances
		    private static int instanceCount = 0;

		    // Instance variable to store the height of the tree
		    private int height;

		    // Default constructor
		    public Q12Tree() {
		        this.height = 0;  // Default height is 0
		        instanceCount++;  // Increment the instance count every time a new object is created
		        System.out.println("Planting a tree");
		    }

		    // Constructor with height parameter
		    public Q12Tree(int height) {
		        this.height = height;
		        instanceCount++;  // Increment the instance count
		        System.out.println("Planting a tree");
		    }

		    // Method to display the height of the tree
		    public void displayHeight() {
		        System.out.println("The height of the tree is: " + height + " meters");
		    }

		    // Static method to display the current count of instances
		    public static void displayInstanceCount() {
		        System.out.println("Number of instances created: " + instanceCount);
		    }

		    public static void main(String[] args) {
		        // Creating instances of the Tree class
		        Q12Tree tree1 = new Q12Tree();  // Default constructor (Height = 0)
		        tree1.displayHeight();  // Display height of tree1

		        Q12Tree tree2 = new Q12Tree(5);  // Constructor with height (Height = 5)
		        tree2.displayHeight();  // Display height of tree2

		        Q12Tree tree3 = new Q12Tree();  // Default constructor (Height = 0)
		        tree3.displayHeight();  // Display height of tree3

		        // Display the count of instances created
		        Q12Tree.displayInstanceCount();  // Output: Number of instances created: 3
		    }
		}


	//Planting a tree
	//The height of the tree is: 0 meters
	//Planting a tree
	//The height of the tree is: 5 meters
	//Planting a tree
	//The height of the tree is: 0 meters
	//Number of instances created: 3




