
public class StarTours {
	
	private int seatsAvailable;
	private double rideTime;
	private int waitTime;
	private int excitementPoints;
	public String userSouveniers;
	
	
	public StarTours() {
		seatsAvailable = 20;
		rideTime = 2.5;
		waitTime = 30;
		excitementPoints = 10;
		
	}
	
	public int SeatsAvailable(int seatsNeeded) {
		if(seatsAvailable - seatsNeeded > 0) {
			System.out.println("There are " + seatsAvailable);
			return (seatsAvailable - seatsNeeded);
		}
		return(0);
	}
	
	public void RideStarTours() {
		userExcitement += excitementPoints;
		System.out.println("You rode Star Tours and gained " + excitementPoints + " excitement points!");
	}
	
	public void getSouvenier() {
		userSouveniers += "Star Tours souvenier";
		System.out.println("You got a souvenier from Star Tours! Check your souveniers to find it there.");
	}
	
}
