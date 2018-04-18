package cars;
import parts.*;
import java.text.MessageFormat;

public class Car {
	
	protected String make;
	protected String modelName;
	protected String color;
	protected int numberPlate;
	protected Headlights headLights = new Headlights("Yellow");
	
	public Car(String make, String modelName, String color, int numberPlate, String headLightColor) {
		
		this.make = make;
		this.modelName = modelName;
		this.color = color;
		this.numberPlate = numberPlate;
		this.headLights = new Headlights(headLightColor);
		
	}
	
	public String toString() {
		return MessageFormat.format("Car: {0} {1} ({2})\nNumber Plate: {3} {4}", make, modelName, color, "" + numberPlate, headLights);
		//return "Car: " + make + modelName + color + numberPlate;
	}
	
	public static void main(String[] args) {
		Car newCar = new Car("Toyota", "Camry", "Red", 154235, "Green");
		System.out.println(newCar);
		newCar.headLights.switchLights();
		System.out.println(newCar);
		newCar.headLights.switchLights();
		System.out.println(newCar);
		
		
	}

}
