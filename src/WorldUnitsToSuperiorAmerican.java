
public class WorldUnitsToSuperiorAmerican {
	
	//declare variables
	double inputMeters;
	
	
	//Constructor
	//Initialize variables
	public WorldUnitsToSuperiorAmerican()
	{
		// TODO Auto-generated constructor stub
		
		inputMeters = 0;
	}
	
	private double conversion(double inputMeters)
	{
		double conversionRate;
		//1 meter = 3.28084 feet
		double meterToFeet = 3.28084;
		double conversion = (inputMeters * meterToFeet);
		
		return conversion;
		
	}
	
	public String toString()
	{
		return "conversion"; //for now
		
	}

	

}
