import java.util.Scanner;
public class ReddRockettsPizza {
	
	private String menue;
	private double singleSlicePrice;
	private double twoSlicePrice;
	private double wholePizzaPrice;
	private double pizzaChoice;
	private String userSouviners;
	
	public ReddRockettsPizza(){
		menue ="(1)Cheese Pizza, (2)Pepperoni Pizza, (3)Spinach Pizza";
		singleSlicePrice = 6.99;
		twoSlicePrice = 12.99;
		wholePizzaPrice = 17.99;
	}
	public void ReadMenue() {
		System.out.println(menue);
		System.out.println("The price for one slice of pizza is" + singleSlicePrice + "/n The price for two slices is " + twoSlicePrice + "/n The price of an entire pizza is " + wholePizzaPrice);
	}
	public double purchase(int pizzaOrder) {
		Scanner myScanner = new Scanner(System.in);
		switch(pizzaOrder) {
		case 1:
			System.out.println("You ordred the Cheese Pizza");
			break;
		case 2:
			System.out.println("You ordered the Pepperoni Pizza");
			break;
		case 3:
			System.out.println("You ordered the Spinch Pizza");
			break;
		}
		System.out.println("Do you want (1)one slice of pizza, (2)two slices of pizza, or a (3)whole pizza");
		int choice = myScanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("That will cost you $6.99");
			pizzaChoice = singleSlicePrice;
			break;
		case 2:
			System.out.println("That will cost you $12.99");
			pizzaChoice = twoSlicePrice;
			break;
		case 3:
			System.out.println("That will cost you $17.99");
			pizzaChoice = wholePizzaPrice;
			break;
		}
		myScanner.close();
		return pizzaChoice;
	}
	public void UseRestroom() {
		System.out.println("You go to the restroom in Redd Rockett's Pizza Pod");
	}
	public void GetSouvenier() {
		userSouviners += " Redd Rockett's Pizza Pod Souvenier";
	}
}
