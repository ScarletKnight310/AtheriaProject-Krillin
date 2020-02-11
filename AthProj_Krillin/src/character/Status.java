package character;

import base.*;

public class Status 
{
	private Stat CAS;
	private Stat CON;
	
	public boolean MagicUser[];
	public String cond;
	
	public Status(Stat CON, Stat CAS) 
	{
		cond = "fine";
		this.CON = CON;
		this.CAS = CAS;
	}
	
	public int getHP()
	{
		return CON.getBonus();
	}
	
	public int getMP()
	{
		return CAS.getBonus();
	}

}