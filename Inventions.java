
public class Inventions
{
	private int capacity;
	private double wait_time;
	private double ride_time;
	private int excitement_points;
	public int souvenirs;
	
	public Inventions(double wait_time2, double ride_time2, int excitement_points2)
	{
		capacity = 50;
		wait_time = 30;
		ride_time = 5;
		excitement_points = 10;
		souvenirs = 1;
	}
	public int spotsavailable(int spotsneeded)
	{
		if(capacity > spotsneeded)
		{
			int spotsleft = capacity - spotsneeded;
		return spotsleft;
		}
		else
		{
			return (0);
		}
	}
	public String wait_time()
	{
		return ("the wait time is " + wait_time);
	}
	public String ride()
	{
		return ("You gained " + excitement_points + " excitements! Ride was " + ride_time + " minutes");
	}
	public void souvenir()
	{
		System.out.println("Here is your souvenir ");
	}
		
}
