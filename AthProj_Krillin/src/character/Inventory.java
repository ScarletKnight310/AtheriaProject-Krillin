package character;

import java.util.HashMap;

import base.*;
//import base.AthObject;

public class Inventory 
{
	HashMap<AthObject,Integer> bag;
	public int gil = 2_000;
	
	public Inventory() 
	{
		this.bag = new HashMap<>();
		//this.gil = startMoney;	
	}
	
	public void addItem(AthObject item)
	{
		if(bag.containsKey(item))
		{
			bag.put(item, bag.get(item) + 1);
		}
		else
		{
			bag.put(item, 1);
		}
	}
	
	public void deleteItem(AthObject item)
	{
		if(bag.containsKey(item))
		{
			int quantity = bag.get(item);
			if(quantity > 1)
				bag.put(item, bag.get(item) - 1);
			else
				bag.remove(item);
		}
	}
	
	public String toString()
	{
		StringBuilder str = new StringBuilder("Inventory:\n");
		str.append("Gil: ").append(gil).append("\n");
		bag.forEach((k,v) ->{
		str.append(k.name).append(" - ").append(v).append("\n");
		});
		return str.toString();
	}
}
