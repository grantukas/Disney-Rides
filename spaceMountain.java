public class spaceMountain {
	
	private int seatsAvailable;
	private double rideTime;
	private int waitTime;
	private int excitementPoints;
	public String userSouveniers;
	
	
	public spaceMountain() {
		seatsAvailable = 20;
		rideTime = 4;
		waitTime = 30;
		excitementPoints = 30;
		
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
		System.out.println("You rode Space Mountainand gained " + excitementPoints + " excitement points!");
	}
	
	public void getSouvenier() {
		userSouveniers += "Star Tours souvenier";
		System.out.println("You got a souvenier from Space Mountainand! Check your souveniers to find it there.");
	}
	
}

