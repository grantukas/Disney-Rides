package dayInDisney;
import adventure_land.*;	//
import fantasy_land.*;		//X
import neworleans_square.*; //X
import starwars_land.*;		//
import tomorrow_land.*;		//X
import toontown.*;			//XX
public class dayInDisney {
	public static void main(String[] args) {
		neworleans_square.Person Bob = new neworleans_square.Person("Bob", 60, 300);
		
		System.out.println("Welcome to Disney Land!");
		System.out.println("Bob decides to go to New Orleans Square");
		System.out.println("Bob forgot to eat beforehand so he decides to go to Blue Bayou Restaurant.");
		
		// New Orleans Square
		neworleans_square.BlueBayouResturant restaurant = new neworleans_square.BlueBayouResturant();
		restaurant.checkMenu();
		restaurant.purchaseItem("pie");
		System.out.println("Bob skips out on the check and leaves.");
		System.out.println("\nBob is feeling adventurous and decides to go to the haunted house.\n");
		
		neworleans_square.HauntedHouse hauntedHouse = new neworleans_square.HauntedHouse();
		hauntedHouse.buyTicket();
		hauntedHouse.waitInLine();
		System.out.println("\nBob needs caffeine NOW. He sees a cafe and skips all the way there.\n");
		
		neworleans_square.CafeOrleans.checkMenu(true);
		neworleans_square.CafeOrleans.purchaseItem("coffee");
		System.out.println("\nBob now has too much energy for a 60 year old.\nHe needs to run around to another section of the park.");
		
		// Tomorrowland
		System.out.println("\nBob decides to go to Tomorrowland and ride the Star Tours ride to burn some energy");
		tomorrow_land.StarWars starTours = new tomorrow_land.StarWars();
		starTours.rideStarTours();
		
		tomorrow_land.ReddRockettsPizza reddPizza = new tomorrow_land.ReddRockettsPizza();
		System.out.println("\nThat ride made Bob sick so he needs to use the bathroom.");
		reddPizza.UseRestroom();
		
		tomorrow_land.spaceMountain spaceMountain = new tomorrow_land.spaceMountain();
		System.out.println("\nSpace Mountain looks like fun!");
		spaceMountain.rideSpaceMountain();
		
		System.out.println("\nBob is feeling bored so he leaves Tomorrowland and decides to go to Fantasy Land");
		
		// Fantasy Land
		fantasy_land.Characters characters = new fantasy_land.Characters("Bob");
		System.out.println("He encounters a character upon entering Fantasy Land.");
		characters.sayHi("Bobette");
		System.out.println("Bob almost fell in love with Bobette. He needs to go on a ride to take his mind off of her.");
		
		fantasy_land.TeaCups teaCups = new fantasy_land.TeaCups();
		teaCups.enterRide();
		System.out.println("Bob wishes Bobette could've joined in him the teacups...");
		
		System.out.println("\nWandering off, Bob encounters a churro stand! More food!");
		fantasy_land.ChurroStand churroStand = new fantasy_land.ChurroStand(10);
		churroStand.giveChurros();
		
		System.out.println("\nFantasy land wasn't interesting enough so Bob ambles over to Toontown.");
		
		//Toontown
		toontown.DonaldBoat donaldBoat = new toontown.DonaldBoat();
		donaldBoat.enterBoat();
		
		System.out.println("\nBob decides to check out the Goofy Playhouse.");
		toontown.GoofyPlayHouse.enterPlayhouse();
		
		System.out.println("\nBob feels like a train ride.");
		toontown.Railroad railroad = new toontown.Railroad();
		System.out.println("Bob needs to check the weather before he can ride to make sure its safe.");
		railroad.checkWeather();
		railroad.rideTrain();
		
		// Star Wars Land
		System.out.println("\nToontown really didn't interest Bob, but he loves Star Wars.\nBob sprints all the way to Star Wars Land and almost has a heart attack.");
		System.out.println("He needs s drink after that.");
		
		System.out.println("Bob goes to the Cantina");
		starwars_land.BantuuCantina Cantina = new starwars_land.BantuuCantina();
		Cantina.orderBantuuCantina();
		
		System.out.println("After that mean Bob decides to go to the First Order Battle Escape Ride");
		starwars_land.firstOrderBattleEscape FOBE = new starwars_land.firstOrderBattleEscape();
		FOBE.rideBattleEscape();
		
		System.out.println("That was fun, Bob cant waint to get on the next ride. \nHe runs over to the Millenium Falcon ride.");
		starwars_land.MilleniumFalcon FalconRide = new starwars_land.MilleniumFalcon();
		FalconRide.RideMillenium();
		
		System.out.println("Its getting late in the day, Bob only has time to go to one more section of the park");
		System.out.println("Bob heads over to Adventure Land");
		System.out.println("Bob sees the wait time for Enchanted Tiki Room is " + tikiRoomAttr.getWaitTime());
		System.out.println("While waiting in line, Bob sees his favorite character, " + tarzanCharacter.getName());
		System.out.println("Bob gets to hungry waiting in line and decides to instead go to the burger stall and see if they have a vegetarian option.");
		if(burgerStall.VegetarianOptions() == true) 
		{
			System.out.println("they have a vegie burger");
		}
		else 
		{
			System.out.println("They only server meat");
		}
		System.out.println("Bob is tired now and decideds to leave disney land and go home.");
		
	}
	
}
