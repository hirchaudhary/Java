
public class MainCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.performOperation("10.5");
		cal.performOperation("+");
		cal.performOperation("5.2");
		cal.performOperation("*");
		cal.performOperation("10");
		cal.performOperation("=");
		cal.performOperation("10");
		cal.performOperation("*");
		cal.performOperation("5.2");
		cal.getResult();
	}
}
