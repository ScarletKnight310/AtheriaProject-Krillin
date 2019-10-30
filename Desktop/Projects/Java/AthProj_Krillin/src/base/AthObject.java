package base;

public class AthObject 
{
	String name,desc;
	Stat[] stats;
	private int id;
	
	// Label with Temp Stats
	public AthObject(String name, String desc, Stat[] stats)
	{
		this.name = name;
		this.desc = desc;
		this.stats = stats;
		this.id = this.name.toUpperCase().hashCode();
	}
	
	// Label with Temp a Single Temp Stat
	public AthObject(String name, String desc, Stat stat)
	{
		this(name, desc, new Stat[] {stat});
	}
	
	// Bare Label
	public AthObject(String name, String desc)
	{
		this(name, desc, new Stat("",0));
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
}
