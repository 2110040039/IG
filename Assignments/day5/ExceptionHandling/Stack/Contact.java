package day5.ExceptionHandling.Stack;

public class Contact {
	    private String firstName;
	    private String middleName;
	    private String lastName;
	    private String dateOfBirth;
	    private String gender;
	    private String mobileNumber;

	    // Default constructor
	    public Contact() {}

	    // Constructor with parameters
	    public Contact(String firstName, String middleName, String lastName, String dateOfBirth, String gender, String mobileNumber) {
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	        this.dateOfBirth = dateOfBirth;
	        this.gender = gender;
	        this.mobileNumber = mobileNumber;
	    }

	    // Getters and Setters
	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getMiddleName() {
	        return middleName;
	    }

	    public void setMiddleName(String middleName) {
	        this.middleName = middleName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(String dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getMobileNumber() {
	        return mobileNumber;
	    }

	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }

	    // Validate the Contact object
	    public boolean validate() {
	        // Basic validation for non-empty fields and proper mobile number format (simple check)
	        if (firstName == null || firstName.isEmpty() ||
	            lastName == null || lastName.isEmpty() ||
	            mobileNumber == null || mobileNumber.isEmpty() || !mobileNumber.matches("\\d{10}")) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Contact [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", mobileNumber=" + mobileNumber + "]";
	    }
	}


