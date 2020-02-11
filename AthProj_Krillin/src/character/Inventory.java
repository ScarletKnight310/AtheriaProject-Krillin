package character;

import java.util.HashMap;

import base.*;
//import base.AthObject;

public class Inventory 
{
	HashMap<AthObject,Integer> items;
	public int gil = 2_000;
	
	public Inventory() 
	{
		this.items = new HashMap<>();
		//this.gil = startMoney;	
	}
	
	public void addItem(AthObject item)
	{
		if(items.containsKey(item))
		{
			items.put(item, items.get(item) + 1);
		}
		else
		{
			items.put(item, 1);
		}
	}
	
	public void deleteItem(AthObject item)
	{
		// Delete or inc down
	}
	
	public String toString()
	{
		return "do later";
	}
}
