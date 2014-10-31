package com.schlimmer.wutsaConvert;

public class WorldUnitsToSuperiorAmerican {
	
	//declare variables
	double unitValue;
	String unitMeasurementType;
	String unitConvertToType;
	private double inchesToCm = 2.54;
	private double cmToInches = 0.3937;
	private String mile = "mi";
	private String kilometer = "km";
	private int miValue = 5280;
	private int ftValue = 12;
	private int inValue = 1;
	private int kmValue = 1000;
	private int mValue = 100;
	private int cmValue = 1;
	
	//2 constructors, one to initialize variables to 0 and 1 of the same name to accept parameters
	//Constructor
	
	//Initialize variables
	public WorldUnitsToSuperiorAmerican()
	{
		unitValue = 0;
		unitMeasurementType = "";
		unitConvertToType = "";
	}
	public WorldUnitsToSuperiorAmerican(double inputUnitValue, String inputUnitMeasurementType, String inputUnitConvertToType)
	{
		// TODO Auto-generated constructor stub
		
		unitValue = inputUnitValue;
		unitMeasurementType = inputUnitMeasurementType;
		unitConvertToType = inputUnitConvertToType;
		this.conversion(unitValue, unitMeasurementType, unitConvertToType);
	}
	
	
	private double conversion(double unitValue, String unitMeasurementType, String unitConvertToType)
	{
		//TODO: Create conversion methods and just call them here rather than hard coding each conversion
		double conversion = 0;
		if (unitMeasurementType == mile && unitConvertToType == kilometer)
		{
			conversion = (unitValue * miValue * ftValue * inchesToCm / mValue / kmValue);
		}
		return conversion;
	}
	
	
	public String toString()
	{
		return unitValue + " <unitType> is equal to "  + this.conversion(unitValue, unitMeasurementType, unitConvertToType) + " <convertedUnitType>"; //for now
	}
	

	public static void main(String[] args)
	{
		WorldUnitsToSuperiorAmerican convert = new WorldUnitsToSuperiorAmerican(1, "mi", "km");
		
		System.out.println(convert.toString());
		
	}

}
