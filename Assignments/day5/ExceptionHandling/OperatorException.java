package day5.ExceptionHandling;

public class OperatorException extends Exception{
	public OperatorException(String message) {
        super(message);
    }
}


//For the input:
//Activity activity = new Activity("Hello", "Welcome", "+");
//Output:
//HelloWelcome
//For the input:
//Activity activity = new Activity("HelloWorld", "World", "-");
//Output:
//Hello