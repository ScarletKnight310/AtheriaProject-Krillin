package base;

public class DeityTag 
{
	private String Domain;
	private String Element;
	// Make Weapon for this in Equipment
	private String Weapon;
	
	public DeityTag(String Domain, String Element, String Weapon)
	{
		this.Domain = Domain;
		this.Element = Element;
		this.Weapon = Weapon;
	}
	
	public String getDomainType()
	{
		return this.Domain;
	}
	
	public String getElementType()
	{
		return this.Element;
	}
	
	public String getWeapon()
	{
		return this.Weapon;
	}
}
