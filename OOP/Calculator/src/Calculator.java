
public class Calculator implements ICalculator, java.io.Serializable{
	
	private static final long serialVersionUID = 1L;
	private double operandOne;
	private double operandTwo;
	private String setOperation;
	private double endResult;
	
	//constructor
	public Calculator() {
		operandOne = 0;
		operandTwo = 0;
		endResult = 0;
		setOperation = "";
	}
	
	//getters and setters
	public double getOperandOne() {return operandOne;}
	public void setOperandOne(double operandOne) {this.operandOne = operandOne;}

	public double getOperandTwo() {return operandTwo;}
	public void setOperandTwo(double operandTwo) {this.operandTwo = operandTwo;}
	public String getSetOperation() {return setOperation;}

	public void setSetOperation(String setOperation) {this.setOperation = setOperation;}
	
	
	
	@Override
	public void performOperation(String input) {
		String[] operand = {"+", "-", "*", "/", "%", "="};
		int count = 0;

		for(String value : operand) {
			if(input.equals(value)) {
				setOperation = input;
				count++;
			}
		}
		
		if(count == 0) {
			if(endResult == 0.0 ) {
				endResult = Double.parseDouble(input);
			}else{
				operandOne = Double.parseDouble(input);
		        switch(setOperation){
		            case "+":
		                endResult += operandOne;
		                break;
		            case "-":
		            		endResult -= operandOne;
		                break;
		            case "*":
		                endResult *= operandOne;
		                break;
		            case "/":
		            		endResult /= operandOne;
		                break;
		            case "%":
		                endResult %= operandOne;
		                break;
		            case "=":
		                getResult();
		                break;
		            default:
		                endResult = 0;
		                break;
		        }
			}
		}
	}

	@Override
	public double getResult() {
		System.out.println(endResult);
		return endResult;
	}
}
