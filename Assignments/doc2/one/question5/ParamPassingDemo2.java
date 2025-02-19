package doc2.one.question5;

public class ParamPassingDemo2 {
	    public static void main(String[] args) {
	        // Test with primitive integers
	        int num1 = 5, num2 = 10;

	        System.out.println("Before swapping integers:");
	        System.out.println("num1 = " + num1 + ", num2 = " + num2);

	        // Call swap method for primitive integers
	        swap(num1, num2);

	        System.out.println("After swapping integers:");
	        System.out.println("num1 = " + num1 + ", num2 = " + num2);  // num1 and num2 will not change due to pass by value

	        // Test with integer arrays
	        int[] arr1 = {1, 2, 3};
	        int[] arr2 = {4, 5, 6};

	        System.out.println("\nBefore swapping arrays:");
	        System.out.println("arr1 = " + arrayToString(arr1));
	        System.out.println("arr2 = " + arrayToString(arr2));

	        // Call swap method for integer arrays
	        swap(arr1, arr2);

	        System.out.println("After swapping arrays:");
	        System.out.println("arr1 = " + arrayToString(arr1));  // arr1 and arr2 will be swapped
	        System.out.println("arr2 = " + arrayToString(arr2));  // arr1 and arr2 will be swapped
	    }

	    // Swap method for two primitive integers
	    public static void swap(int a, int b) {
	        // Swap logic for primitive types
	        int temp = a;
	        a = b;
	        b = temp;

	        // Print inside method to show swapping happened within the method, but outside it won't reflect
	        System.out.println("Inside swap method (primitives):");
	        System.out.println("a = " + a + ", b = " + b);
	    }

	    // Swap method for two integer arrays
	    public static void swap(int[] arr1, int[] arr2) {
	        // Swap logic for arrays (array reference is swapped)
	        int[] temp = arr1;
	        arr1 = arr2;
	        arr2 = temp;

	        // Print inside method to show swapping happened with the references of arrays
	        System.out.println("Inside swap method (arrays):");
	        System.out.println("arr1 = " + arrayToString(arr1)); // arr1 will now point to arr2
	        System.out.println("arr2 = " + arrayToString(arr2)); // arr2 will now point to arr1
	    }

	    // Utility method to convert array to string for easy printing
	    public static String arrayToString(int[] arr) {
	        StringBuilder sb = new StringBuilder();
	        for (int num : arr) {
	            sb.append(num).append(" ");
	        }
	        return sb.toString().trim();
	    }
	}




//Before swapping integers:
//num1 = 5, num2 = 10
//Inside swap method (primitives):
//a = 10, b = 5
//After swapping integers:
//num1 = 5, num2 = 10
//
//Before swapping arrays:
//arr1 = 1 2 3
//arr2 = 4 5 6
//Inside swap method (arrays):
//arr1 = 4 5 6
//arr2 = 1 2 3
//After swapping arrays:
//arr1 = 4 5 6
//arr2 = 1 2 3



