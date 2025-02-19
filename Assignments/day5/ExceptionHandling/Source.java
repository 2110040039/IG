package day5.ExceptionHandling;

public class Source {
	public static void main(String[] args) {
        // Create Activity object with values
        Activity activity = new Activity("Hello", "Welcome", "+");
        
        // Create Source object for validation and operation
        Source source = new Source();

        try {
            // Validate the activity input
            if (!source.validate(activity)) {
                throw new OperatorException("Invalid parameters");
            }

            // Perform the operation and get the result
            String result = source.doOperation(activity);
            System.out.println(result);

        } catch (OperatorException e) {
            e.printStackTrace();  // Print the stack trace of the exception
        }
    }

    // Validate method for input conditions
    public boolean validate(Activity activity) {
        // Check if string1, string2, or operator are null
        if (activity.getString1() == null || activity.getString2() == null || activity.getOperator() == null) {
            System.out.println("One or more input parameters are null.");
            return false;
        }

        // Check if the operator is either "+" or "-"
        if (!activity.getOperator().equals("+") && !activity.getOperator().equals("-")) {
            return false;  // Invalid operator, OperatorException will be thrown
        }

        // If no exceptions, return true
        return true;
    }

    // Perform the operation based on the operator
    public String doOperation(Activity activity) {
        // If the operator is "+", concatenate string1 and string2
        if (activity.getOperator().equals("+")) {
            return activity.getString1() + activity.getString2();
        }

        // If the operator is "-", remove characters in string2 from string1
        else if (activity.getOperator().equals("-")) {
            String result = activity.getString1();
            for (int i = 0; i < activity.getString2().length(); i++) {
                result = result.replace(String.valueOf(activity.getString2().charAt(i)), "");
            }
            return result;
        }

        // Default return empty if operator is invalid (should not happen due to validation)
        return "";
    }

}
