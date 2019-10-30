package content;

import base.*;

// Upbringings
public class Origins extends AthContentList
{
	public Origins(AthObject[] base) 
	{
		super(base);
	}
	
	public void addOrigin(AthObject addon)
	{
		contentList.add(addon);
	}
}
