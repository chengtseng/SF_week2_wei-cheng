package products;
import enums.CarType;
import enums.Manufacture;

public class SemiTruck extends DieselAuto{	
	public SemiTruck(String v, 
					Manufacture manufacture, 
					int range, 
					String color, 
					int numOfWheel, 
					int numOfCylin, 
					double basePrice, 
					String vCode, 
					double luxT) {
		
		super(v, manufacture, range, color, numOfWheel, numOfCylin, basePrice, vCode, luxT);
		
		//type specific
		this.specialLicenseRequired = true;
		this.limitable = true;
		this.type = CarType.SEMI_TRUCK;
		
		//set and determine range finally
		this.setRange(range);
	}
}

