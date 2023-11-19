package enumExample;

public class Seat {
	
	boolean isBooked;
	int price;
	SeatType type;
	
	public Seat(boolean isSeatBooked,int seatPrice,SeatType typeOfSeat) {
		isBooked=isSeatBooked;
		price=seatPrice;
		type=typeOfSeat;
		
	}

	public enum SeatType {

		ECONOMY("economy", 800),
		BUISNESS("buisness", 1500),
		FIRST_CLASS("first class", 2500);

		String nameOfTheSeatType;
		int priceOfSeat;

		SeatType(String name, int price) {
			nameOfTheSeatType = name;
			priceOfSeat = price;
		}

		String getName() {
			return nameOfTheSeatType;
		}

		int getPrice() {
			return priceOfSeat;
		}

	}

}


