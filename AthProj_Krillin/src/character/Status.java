package character;

import base.*;

public class Status 
{
	private Stat CAS;
	private Stat CON;

	public int health;
	public int mana;

	public boolean MagicUser;
	public String cond;
	
	public Status(Stat CON, Stat CAS) 
	{
		cond = "fine";
		this.CON = CON;
		this.CAS = CAS;
		this.health = getHP();
		this.mana = getMP();
	}
	
	public int getHP()
	{
		return CON.getBonus();
	}
	
	public int getMP()
	{
		return CAS.getBonus();
	}

	public String toString()
	{
		StringBuilder str = new StringBuilder("Status: ").append(cond);
		str.append("\nHP: ").append(health).append("/").append(getHP());
		str.append("\nMP: ").append(mana).append("/").append(getMP());
		return str.toString();
	}
}