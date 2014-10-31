
public class WorldUnitsToSuperiorAmerican {
	
	//declare variables
	double inputMeters;
	
	//2 constructors, one to initalize vars to 0 and 1 of the same name to accept parameters
	//Constructor
	
	//Initialize variables
	public WorldUnitsToSuperiorAmerican()
	{
		inputMeters = 0;
	}
	public WorldUnitsToSuperiorAmerican(double input)
	{
		// TODO Auto-generated constructor stub
		
		inputMeters = input;
		this.conversion(input);
	}
	
	private double conversion(double inputMeters)
	{
		//1 meter = 3.28084 feet
		double meterToFeet = 3.28084;
		double conversion = (inputMeters * meterToFeet);
		
		return conversion;
		
	}
	
	public String toString()
	{
		return inputMeters + " meter(s) is equal to "  + this.conversion(inputMeters) + " feet"; //for now
		
	}
	
	//public String display()
	//{
		//return System.out.println(this.toString());
	//error: cannot return void result^
	//}*//

	public static void main(String[] args)
	{
		WorldUnitsToSuperiorAmerican convert = new WorldUnitsToSuperiorAmerican(1);
		
		System.out.println(convert.toString());
		
	}

}
