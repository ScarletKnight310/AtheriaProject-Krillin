package base;

public class Stat 
{
	public String name, desc;

	private int bonus;
	private int mod;
	
	private boolean isTemp;
	private int id;
	
	private static int modAddInterval = 5;
	
	// Character Bound Stat
	public Stat(String name, String desc)
	{
		this.name = name;
		this.desc = desc;
		this.bonus = 0;
		isTemp = false;
		id = this.name.toLowerCase().hashCode();
	}
	
	// Attribute(race, class, etc.) bound statistic
	// Stat -> bonus add/subract // Trait -> id of trait // Gil -> amount of gil
	public Stat(String name,int bonus)
	{
		this.name = name;
		this.bonus = bonus;
		isTemp = true;
		id = this.name.toLowerCase().hashCode();
	}
	
	private void calcMod()
	{
		if(this.bonus < modAddInterval)
		{
			this.mod = 0;
		}
		else
		{
			this.mod = (int)(bonus/modAddInterval);
		}
	}
	
	//
	private void changeBonus(int change)
	{
		this.bonus = change;
		calcMod();
	}
	
	public void modifyBonus(int change)
	{
		if(!isTemp)
			changeBonus(this.bonus + change);
	}
	
	// 
	public int getBonus()
	{
		return this.bonus;
	}
	
	public int getMod()
	{
		return this.mod;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	//
	public String toString()
	{
		if(isTemp)
			return name + " - " + bonus;
		
		return name + "  " + bonus + " -> " + mod;
	}
}
