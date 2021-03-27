
public class Car {
    private String model;
    private String[] features;
	public Car(String model, String[] features) { //VarArgs
		this.model = model;
		this.features = features;
	}
    public void specs() {
    	System.out.println("Features of : " +model);
    	for(String f : features)
    		System.out.println(" > "  + f );
    }
    public static void main(String[] args) {
		String[] falto = {"keyless", "powersteering", "AC"};
		Car alto = new Car("Suzuki Alto",falto);
		
		String[] fhect = {"Climatechanges", "ABS","MoonRoof","AirBags"};
		Car hector  = new Car("Mg Hector", fhect);
		
		alto.specs();
		hector.specs();
		
		
		
	}
   
}
