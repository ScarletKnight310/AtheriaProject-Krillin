package content;

import base.*;

// Upbringing
public class Origins extends AthContentList
{
	public Origins(AthObject[] base) 
	{
		super(base);
	}
	
	//
	public void addOrigin(AthObject addon)
	{
		content.add(addon);
	}
	
	//
	public AthObject getOrigin(int i) 
	{
		return content.get(i);
	}
}
