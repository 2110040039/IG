package doc2.one;

public class PhoneNumber {
	    private String areaCode;
	    private String exchange;
	    private String extension;

	    // Constructor to initialize the phone number components
	    public PhoneNumber(String areaCode, String exchange, String extension) {
	        // Validate the inputs to ensure they are 3 digits for areaCode and exchange, and 4 digits for extension
	        if (areaCode.length() != 3 || exchange.length() != 3 || extension.length() != 4) {
	            throw new IllegalArgumentException("Invalid phone number components");
	        }

	        this.areaCode = areaCode;
	        this.exchange = exchange;
	        this.extension = extension;
	    }

	    // Method to return a formatted phone number as a string
	    public String toString() {
	        return String.format("(%s) %s-%s", areaCode, exchange, extension);
	    }

	    // Method to check if two phone numbers are equal
	    public boolean equals(PhoneNumber other) {
	        if (other == null) return false;
	        return this.areaCode.equals(other.areaCode) &&
	               this.exchange.equals(other.exchange) &&
	               this.extension.equals(other.extension);
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        // Create objects
	        PhoneNumber p1 = new PhoneNumber("800", "867", "5309");
	        PhoneNumber p2 = new PhoneNumber("800", "867", "5309");
	        PhoneNumber p3 = new PhoneNumber("800", "555", "1234");

	        // Test toString method
	        System.out.println("Phone Number 1: " + p1.toString());
	        System.out.println("Phone Number 2: " + p2.toString());
	        System.out.println("Phone Number 3: " + p3.toString());

	        // Test equals method
	        System.out.println("p1 equals p2: " + p1.equals(p2)); // Should return true
	        System.out.println("p1 equals p3: " + p1.equals(p3)); // Should return false
	    }
	}



