package cars;

public class ModelX extends SportsUtilityVehicle {
	protected String fuelType;
	
	public ModelX(String color, int numberPlate) {
		super("Tesla", "Model X", color, numberPlate, "Blue");
		this.fuelType = "Electric";
	}
	
	public static void main(String[] args) {
		ModelX modelX = new ModelX("Blue", 614138);
		System.out.print(modelX.toString() + "\nFuel: " + modelX.fuelType + "\nCar Type: " + modelX.type);
	}
}
