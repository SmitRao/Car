package cars;

public class SportsUtilityVehicle extends Car {
	
	protected String type;
	
	public SportsUtilityVehicle(String make, String modelName, String color, int numberPlate, String headLightColor) {
		super(make, modelName, color, numberPlate, headLightColor);
		this.type = "SUV";
	}
	
	public static void main(String[] args) {
		SportsUtilityVehicle suv = new SportsUtilityVehicle("Honda", "CR-V", "Black", 145246, "White");
		suv.headLights.switchLights();
		System.out.print(suv.toString());
	}

}
