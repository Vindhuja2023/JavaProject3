package cruiseAndHotel3;

public class DeluxSuite extends Hotel3 {
	String roomType;
	int maxNumAdultsAccomodate;
	int maxNumChildrenAccomodate;
	double roomRate;

	public DeluxSuite(String roomType, int maxNumAdultsAccomodate, int maxNumChildrenAccomodate, double roomRate) {
		super(roomType, maxNumAdultsAccomodate, maxNumChildrenAccomodate, roomRate);
		this.roomType=roomType;
		this.maxNumAdultsAccomodate=maxNumAdultsAccomodate;
		this.maxNumChildrenAccomodate=maxNumChildrenAccomodate;
		this.roomRate=roomRate;
	}
	
	

}
