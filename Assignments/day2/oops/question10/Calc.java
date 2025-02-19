package day2.oops.question10;

public class Calc implements Calculator{
	public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }
}


