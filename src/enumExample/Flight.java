package enumExample;

public class Flight {

	String nameOfFlight;
	int seatsTotal;
	FlightType typeOfFlight;

	public Flight(String flightName, int sTotal,FlightType type) {
		nameOfFlight = flightName;
		seatsTotal = sTotal;
		typeOfFlight=type;
	}

	enum FlightType {
		DOMESTIC("Domestic"), 
		INTERNATIONAL("International");
		
		String typeOfFlight;
		
		private FlightType(String type) {
			typeOfFlight=type;
		}
		
		String getTypeOfFlight() {
			return typeOfFlight;
		}
	}
}
