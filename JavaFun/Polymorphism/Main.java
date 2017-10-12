class Car {
	private String name;
	private Boolean engine;
	private int wheels;
	private int cylinders;
	
	public Car(String name, int cylinders) {
		this.name = name;
		this.cylinders = cylinders;
		this.engine = true;
		this.wheels = 4;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getEngine() {
		return engine;
	}

	public void setEngine(Boolean engine) {
		this.engine = engine;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public String startEngine() {
		return "Engine Starts";
	}
	
	public String accelerate() {
		return "Accelerated";
	}
	
	public String brake() {
		return "Brake pushed";
	}
	
}

class Toyota extends Car{

	public Toyota(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "Engine Starts in camry";
	}

	@Override
	public String accelerate() {
		return "Accelerated camry";
	}

	@Override
	public String brake() {
		return "Brake pushed camry";
	}	
}

class Honda extends Car{

	public Honda() {
		super("Honda", 2);
	}
	
	public String accelerate() {
		return "Accelerated Honda Car";
	}
	
	public String brake() {
		return "Brake pushed";
	}
	
}
public class Main {
	public static void main(String[] args) {
		Car car = new Car("Car", 2);
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		Toyota toy = new Toyota("Toyota camry", 1);
		System.out.println(toy.accelerate());
		System.out.println(car.getName());
		System.out.println(toy.getName());
	}
}
