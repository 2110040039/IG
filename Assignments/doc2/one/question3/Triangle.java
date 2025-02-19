package doc2.one.question3;

public class Triangle extends Shape {
	private int height;

    // Constructor to initialize length (base) and height
    public Triangle(int length, int height) {
        super(length);  // Calling parent class constructor
        this.height = height;
    }

    // Override calculateArea method
    @Override
    public double calculateArea() {
        return 0.5 * length * height;  // Formula for triangle area
    }

}
